package com.ambank.model;

public class BusinessAccount extends Account {
    private String NPWP;
    private String noSK;

    public BusinessAccount(String nameHolder) {
        super(nameHolder);
    }
}
