package com.bootcoding.encapsulation.medicalShop.Medicines;

import java.util.Date;

public class medicine {
    private String name;
    private double price;
    private String power;
    private Date expirydate;
    private Date manufaccturedate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }

    public Date getManufaccturedate() {
        return manufaccturedate;
    }

    public void setManufaccturedate(Date manufaccturedate) {
        this.manufaccturedate = manufaccturedate;
    }
}
