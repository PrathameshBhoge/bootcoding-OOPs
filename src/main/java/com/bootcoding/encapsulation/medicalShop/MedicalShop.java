package com.bootcoding.encapsulation.medicalShop;

import com.bootcoding.encapsulation.medicalShop.ShopInfo.shhopinfo;
import com.bootcoding.encapsulation.medicalShop.Customer.customer;
import com.bootcoding.encapsulation.medicalShop.Medicines.medicine;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;


public class MedicalShop {
    public static void main(String[] args) {
        shhopinfo s=new shhopinfo();
        s.setShopname("Appolo");
        s.setOwnername("Prathmesh Bhoge ");
        s.setAddress("Nandanwan Nagpur ");
        s.setId(UUID.randomUUID());
        s.setType("24 Hrs");

        customer c=new customer();
        c.setName("Suresh");
        c.setAge(52);
        c.setContact(7498771678l);
        c.setDisease("Sugar");

        medicine m=new medicine();
        m.setName("Dolo");
        m.setPower("600 Mg");
        m.setPrice(30.00);
        m.setManufaccturedate(getNextDate(-120));
        m.setExpirydate(getNextDate(120));

        System.out.println("Shop INformation ");
        System.out.println();
        System.out.println("Shop name : "+s.getShopname());
        System.out.println("Shop owner Name : "+s.getOwnername());
        System.out.println("Shop address : "+s.getAddress());
        System.out.println("Shop Id : "+s.getId());
        System.out.println("Shop Type : "+s.getType());
        System.out.println();
        System.out.println();

        System.out.println("Customer Information");
        System.out.println();
        System.out.println("Customer Name : "+c.getName());
        System.out.println("Customer Age : "+c.getAge() );
        System.out.println("Customer Contact : "+c.getContact());
        System.out.println("Customer Disease : "+c.getDisease());
        System.out.println();
        System.out.println();

        System.out.println("Medicine Information ");
        System.out.println();
        System.out.println("Medicine Name : "+m.getName());
        System.out.println("Medicine Power : "+m.getPower());
        System.out.println("Medicine Price : "+m.getPrice());
        System.out.println("Medicine Manufacturing Date : "+m.getManufaccturedate());
        System.out.println("Medicine Expiry Date : "+m.getExpirydate());



    }

    private static Date getNextDate(int days){
        Calendar cal  = Calendar.getInstance();
        //subtracting a day
        cal.add(Calendar.DATE, days);
        System.out.println("Date = "+cal.getTime());
        return cal.getTime();
    }
}
