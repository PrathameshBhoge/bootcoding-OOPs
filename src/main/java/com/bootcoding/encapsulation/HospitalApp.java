package com.bootcoding.encapsulation;

import com.bootcoding.encapsulation.hospitaal.Hospital;
import com.bootcoding.encapsulation.patient.Patient;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class HospitalApp {
    public static void main(String[] args){
        Patient p=new Patient();
        p.name="Ramesh";
        p.age=42;
        p.Admitdate=getNextDate(7);
        p.dischagedate=new Date();

        Hospital alexsis=new Hospital();
        alexsis.setName("Alexsis");
        alexsis.setAddress("Nagpur");
        alexsis.setServices("multispeatialist");
        alexsis.setId(UUID.randomUUID());

        System.out.println("hospital name : "+alexsis.getName());
        System.out.println("hospital address : "+alexsis.getAddress());
        System.out.println("hospital services : "+alexsis.getServices());
        System.out.println("hospital  UUId : "+alexsis.getId());
        }

    private static Date getNextDate(int days){
        Calendar cal  = Calendar.getInstance();
        //subtracting a day
        cal.add(Calendar.DATE, days);
        System.out.println("Date = "+cal.getTime());
        return cal.getTime();
    }
}
