package com.bootcoding.encapsulation.election;

import java.util.Calendar;
import java.util.Date;

public class electionApp {
    public static void main(String[] args) {
        Election e=new Election();
        e.setType("Vidhanshabha");
        e.setCity("Nagpur");
        e.setSymbol("Engine");
        e.setElectiondate(new Date());
        e.setResultdate(getNextDate(15));

        candidate c=new candidate();
        c.setName("Suresh");
        c.setAge(42);
        c.setGender("male");
        c.setAdrress("Nagpur");
        c.setEducation("BA pass");

        System.out.println("Election Type : "+e.getType());
        System.out.println("Election city : "+e.getCity());
        System.out.println("Election Symbol : "+e.getSymbol());
        System.out.println("Election Date : "+e.getElectiondate());
        System.out.println("Election Result date : "+e.getResultdate());



        System.out.println("Candidate Name : "+c.getName());
        System.out.println("Candidate age : "+c.getAge());
        System.out.println("Candidate gender : "+c.getGender());
        System.out.println("Candidate Address : "+c.getAdrress());
        System.out.println("Candidate Education :"+c.getEducation());
    }
    private static Date getNextDate(int days){
        Calendar cal  = Calendar.getInstance();
        //subtracting a day
        cal.add(Calendar.DATE, days);
        System.out.println("Date = "+cal.getTime());
        return cal.getTime();
    }
}
