package com.ambank.model;

public class BusinessAccount extends Account {
    // TODO 11: Tambahkan konstanta limit transfer bisnis (Rp 50.000.000)
    public static final int BUSINESS_TRANSFER_LIMIT = 50000000;

    private String NPWP;
    private String noSK;

    public BusinessAccount(String nameHolder) {
        super(nameHolder);
    }

    // TODO 12: Constructor overloading dengan super(nameHolder) serta inisialisasi NPWP dan noSK
    public BusinessAccount(String nameHolder, String NPWP, String noSK) {
        super(nameHolder);
        this.NPWP = NPWP;
        this.noSK = noSK;
    }

    // TODO 13: Sediakan getter dan setter untuk NPWP dan noSK
    public String getNPWP() {
        return NPWP;
    }

    public void setNPWP(String NPWP) {
        this.NPWP = NPWP;
    }

    public String getNoSK() {
        return noSK;
    }

    public void setNoSK(String noSK) {
        this.noSK = noSK;
    }

    // TODO 14: Override getTransferLimit() agar me-return BUSINESS_TRANSFER_LIMIT
    @Override
    public int getTransferLimit() {
        return BUSINESS_TRANSFER_LIMIT;
    }

    // TODO 15: Override displayAccount() panggil super.displayAccount() lalu cetak NPWP dan noSK
    @Override
    public void displayAccount() {
        super.displayAccount();
        // TODO 15: cetak data bisnis di sini
    }
}
