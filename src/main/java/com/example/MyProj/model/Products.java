package com.example.MyProj.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Products {

    @Id
    private int vendorCode;

    private String title;
    private String manufacturer;
    private int price;
    @ManyToOne
    private Providers providers;

    public Products() {
    }

    public Products(int vendorCode, String title, String manufacturer, int price, Providers providers) {
        this.vendorCode = vendorCode;
        this.title = title;
        this.manufacturer = manufacturer;
        this.price = price;
        this.providers = providers;
    }

    public Providers getProviders() {
        return providers;
    }

    public void setProviders(Providers providers) {
        this.providers = providers;
    }



    public int getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




    @Override
    public String toString() {
        return "Products{" +
                "vendorCode=" + vendorCode +
                ", title='" + title + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
