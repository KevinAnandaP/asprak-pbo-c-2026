package com.ambank.model;

import java.util.Random;

public class Card {
    // TODO 1: Ubah semua atribut menjadi private (enkapsulasi), JANGAN buat getPin()
    private String nameHolder;
    private String cardNumber;
    private String pin;
    private boolean isBlocked;
    private int failedAttempts;

    public static final int MAX_FAILED_ATTEMPTS = 3;

    // TODO 2: Validasi PIN harus 6 digit angka, jika tidak valid set default "123456"
    public Card(String nameHolder, String pin) {
        this.nameHolder = nameHolder;
        this.pin = pin;
        this.cardNumber = generateCardNumber();
        this.isBlocked = false;
        this.failedAttempts = 0;
    }

    private String generateCardNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    // TODO 3: Verifikasi PIN (cek blokir, reset failedAttempts jika benar, tambah jika salah, auto-blokir jika salah 3x)
    public boolean verifyPin(String inputPin) {
        return false;
    }

    // TODO 4: Ganti PIN (verifikasi oldPin dulu, lalu cek format newPin 6 digit angka)
    public boolean changePin(String oldPin, String newPin) {
        return false;
    }

    // TODO 5: Sensor nomor kartu, tampilkan 4 digit terakhir saja (contoh: ****-****-****-1234)
    public String getMaskedCardNumber() {
        return "****-****-****-****";
    }

    public String getNameHolder() {
        return nameHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }
}
