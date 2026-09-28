package com.ambank.app;

import com.ambank.model.Account;
import com.ambank.model.BusinessAccount;
import com.ambank.model.Card;

public class App {
    public static void main(String[] args) {

        Transaction.initTransactionList();

        Account joras = new Account("JORAS");
        Account yafi = new Account("YAFI");

        BusinessAccount rotiOLempuyangan = new BusinessAccount("Roti O Lempuyangan");

        Transaction.setorUang(joras, 6000000);
        Transaction.setorUang(yafi, 10000000);

        joras.displayAccount();
        yafi.displayAccount();

        Transaction.makeTransaction(joras, yafi, 5950000);

        joras.displayAccount();
        yafi.displayAccount();

        Transaction.makeTransaction(yafi, rotiOLempuyangan, 14000);

        joras.displayAccount();
        yafi.displayAccount();

        rotiOLempuyangan.displayAccount();
    }
}
