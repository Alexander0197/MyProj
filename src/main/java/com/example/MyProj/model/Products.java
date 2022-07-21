package com.example.MyProj.model;

import javax.persistence.*;

@Entity
public class Products {

    @Id
    private int vendorCode;

    private String title;
    private String manufacturer;
    private int price;

    public Products() {
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

    public Products(int vendorCode, String title, String manufacturer, int price) {
        this.vendorCode = vendorCode;
        this.title = title;
        this.manufacturer = manufacturer;
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
