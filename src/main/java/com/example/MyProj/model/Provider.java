package com.example.MyProj.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Provider {
    @Id
    private int trn;
    private String titleProvider;
    private String bankDetails;
    private int accountNumber;


    public int getTrn() {
        return trn;
    }

    public void setTrn(int trn) {
        this.trn = trn;
    }

    public String getTitleProvider() {
        return titleProvider;
    }

    public void setTitleProvider(String titleProvider) {
        this.titleProvider = titleProvider;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Provider() {
    }

    public Provider(int trn, String titleProvider, String bankDetails, int accountNumber) {
        this.trn = trn;
        this.titleProvider = titleProvider;
        this.bankDetails = bankDetails;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "trn=" + trn +
                ", titleProvider='" + titleProvider + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
