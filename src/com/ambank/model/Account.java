package com.ambank.model;

import java.util.UUID;

import com.ambank.app.Transaction;

public class Account {

    public static final int TRANSFER_LIMIT = 10000000;
    public static final int MINIMUM_SALDO = 50000;

    String nameHolder;

    private String rekening;

    public Account(String nameHolder) {
        this.nameHolder = nameHolder;
        this.rekening = UUID.randomUUID().toString();
    }

    public String getRekening() {
        return this.rekening;
    }

    public int getSaldo() {
        return Transaction.getSaldoFromAccount(this);
    }

    public void displayAccount() {
        System.out.println("MyAmBank v69");
        System.out.println("================================");
        System.out.println("Nama     : " + this.nameHolder);
        System.out.println("Rekening : " + this.rekening);
        System.out.println("Saldo    : " + this.getSaldo());
        System.out.println("================================");
    }
}
