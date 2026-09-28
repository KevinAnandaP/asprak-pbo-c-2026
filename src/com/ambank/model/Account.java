package com.ambank.model;

import java.util.UUID;
import com.ambank.app.Transaction;

public class Account {

    public static final int TRANSFER_LIMIT = 10000000;
    public static final int MINIMUM_SALDO = 50000;

    // TODO 6: Ubah nameHolder jadi private, buat getter & setter (validasi nama tidak boleh kosong)
    private String nameHolder;
    private String rekening;

    // TODO 7: Tambahkan atribut card dan getter getCard() (Relasi ke Card)
    private Card card;

    public Account(String nameHolder) {
        this.nameHolder = nameHolder;
        this.rekening = UUID.randomUUID().toString();
    }

    // TODO 8: Buat objek Card baru dan simpan ke this.card
    public void issueCard(String pin) {
        // TODO 8: implementasikan issueCard di sini
    }

    public Card getCard() {
        return this.card;
    }

    public String getNameHolder() {
        return this.nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        // TODO 6: validasi nama tidak boleh null atau kosong
        if (nameHolder != null && !nameHolder.trim().isEmpty()) {
            this.nameHolder = nameHolder;
        }
    }

    public String getRekening() {
        return this.rekening;
    }

    public int getSaldo() {
        return Transaction.getSaldoFromAccount(this);
    }

    // TODO 9: Return TRANSFER_LIMIT (disiapkan untuk di-override di BusinessAccount)
    public int getTransferLimit() {
        return TRANSFER_LIMIT;
    }

    // TODO 10: Tampilkan info kartu jika ada (nomor tersensor)
    public void displayAccount() {
        System.out.println("MyAmBank v69");
        System.out.println("================================");
        System.out.println("Nama     : " + this.nameHolder);
        System.out.println("Rekening : " + this.rekening);
        System.out.println("Saldo    : " + this.getSaldo());

        // TODO 10: jika this.card != null, cetak nomor kartu

        System.out.println("================================");
    }
}
