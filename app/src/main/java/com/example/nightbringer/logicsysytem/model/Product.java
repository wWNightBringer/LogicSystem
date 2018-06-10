package com.example.nightbringer.logicsysytem.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Nightbringer on 6/5/2018.
 */

public class Product  {
    private String title;
    private String fullName;
    private String serialNumber;

    public Product(String title, String fullName, String serialNumber) {
        this.title = title;
        this.fullName = fullName;
        this.serialNumber = serialNumber;
    }

    public Product() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }



    @Override
    public String toString() {
        return "Product{" +
                ", title='" + title + '\'' +
                ", fullName='" + fullName + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
