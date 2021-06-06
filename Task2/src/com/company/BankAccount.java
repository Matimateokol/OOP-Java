package com.company;

public class BankAccount {

    private double saldo;

    BankAccount(double saldo) {
        this.saldo = saldo;
    }

    public void wyplac(double amount) {
        saldo -= amount;
    }

    public void depozyt(double amount) {
        saldo += amount;
    }

    public double getSaldo() {
        return saldo;
    }

}
