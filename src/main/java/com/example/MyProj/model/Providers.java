package com.example.MyProj.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Providers {
    @Id
    private int trn;
    private String title;
    public String bankDetails;
    private int accountNumber;
    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "providers")
    private List<Products> productsAll;

    public Providers(int trn, String titleProvider, String bankDetails, int accountNumber, List<Products> productsAll) {
        this.trn = trn;
        this.title = titleProvider;
        this.bankDetails = bankDetails;
        this.accountNumber = accountNumber;
        this.productsAll = productsAll;
    }

    public Providers() {
    }

    public Providers(int trn) {
        this.trn = trn;
    }

    public List<Products> getProductsAll() {
        return productsAll;
    }

    public void setProducts(List<Products> productsAll) {
        this.productsAll = productsAll;
    }

    public int getTrn() {
        return trn;
    }

    public void setTrn(int trn) {
        this.trn = trn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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


    @Override
    public String toString() {
        return "Provider{" +
                "trn=" + trn +
                ", titleProvider='" + title + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
