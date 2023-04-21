package com.bootcoding.encapsulation.election;

import java.util.Date;

public class Election {
    private String Type;
    private String city;
    private String symbol;
    private Date electiondate;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Date getElectiondate() {
        return electiondate;
    }

    public void setElectiondate(Date electiondate) {
        this.electiondate = electiondate;
    }

    public Date getResultdate() {
        return resultdate;
    }

    public void setResultdate(Date resultdate) {
        this.resultdate = resultdate;
    }

    private Date resultdate;



}
