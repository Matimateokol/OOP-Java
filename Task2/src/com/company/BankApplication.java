package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.BorderFactory;

public class BankApplication extends JFrame {
    private JPanel mainPanel, subPanel1, subPanel2;

    BankAccount KontoBankowe = new BankAccount(100);

    public BankApplication () {
        //Giving WindowsLookAndFeel
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");  // This line gives Windows Theme
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        setTitle("Konto Bankowe");
        mainPanel = new JPanel(); // main panel
        subPanel1 = new JPanel(); // sub-panel 1
        subPanel2 = new JPanel(); // sub-panel 2

        JButton wyplacButton = new JButton("wyplac");
        subPanel1.add(wyplacButton);

        JLabel kwotaLabel = new JLabel("Kwota:");
        subPanel1.add(kwotaLabel);

        JTextField kwota = new JTextField(10);
        subPanel1.add(kwota);

        JButton depozytButton = new JButton("depozyt");
        subPanel1.add(depozytButton);

        JLabel stanLabel = new JLabel("Stan: " + KontoBankowe.getSaldo());
        subPanel1.add(stanLabel);

        JPanel panel2 = new JPanel();
        mainPanel.add(panel2);

        JTextArea historia = new JTextArea(30, 25);
        historia.setMinimumSize(new Dimension(100, 100));

        // set the border of JTextArea component
        historia.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        subPanel2.add(historia);

        mainPanel.add(subPanel1);
        mainPanel.add(subPanel2);
        add(mainPanel);
        setSize(450, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        //Alert frame
        JFrame frame = new JFrame();

        wyplacButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (KontoBankowe.getSaldo() >= Double.parseDouble(kwota.getText()) && Double.parseDouble(kwota.getText()) > 0) {
                        KontoBankowe.wyplac(Double.parseDouble(kwota.getText()));
                        stanLabel.setText("Stan: " + KontoBankowe.getSaldo());
                        historia.append("Wypłacono: " + kwota.getText() + "\n");
                    } else if (KontoBankowe.getSaldo() < Double.parseDouble(kwota.getText()) && Double.parseDouble(kwota.getText()) > 0){
                        JOptionPane.showMessageDialog(frame,
                                "Brak wystarczających środków pieniężnych na koncie!",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    } else if (Double.parseDouble(kwota.getText()) > 0) {
                        throw new Exception("NegativeNumber");
                    }
                } catch (NumberFormatException a) {
                    JOptionPane.showMessageDialog(frame,
                            "Wprowadzono dane nie będące liczbą!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } catch (Exception nn) {
                    JOptionPane.showMessageDialog(frame,
                            "Wprowadzono liczbę ujemną!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        depozytButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (Double.parseDouble(kwota.getText()) > 0) {
                        KontoBankowe.depozyt(Double.parseDouble(kwota.getText()));
                        stanLabel.setText("Stan: " + KontoBankowe.getSaldo());
                        historia.append("Zdeponowano: " + kwota.getText()+"\n");
                    } else if (Double.parseDouble(kwota.getText()) > 0) {
                        throw new Exception("NegativeNumber");
                    }
                } catch (NumberFormatException b) {
                    JOptionPane.showMessageDialog(frame,
                            "Wprowadzono dane nie będące liczbą!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } catch (Exception nn) {
                    JOptionPane.showMessageDialog(frame,
                            "Wprowadzono liczbę ujemną!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}