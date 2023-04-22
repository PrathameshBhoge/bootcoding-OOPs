package com.bootcoding.encapsulation.medicalShop.ShopInfo;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class shhopinfo {

    private String shopname;
    private String Ownername;
    private String Address;
    private UUID Id;

    private String type;

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getOwnername() {
        return Ownername;
    }

    public void setOwnername(String ownername) {
        Ownername = ownername;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
