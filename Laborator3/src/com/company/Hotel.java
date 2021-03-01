package com.company;

import java.time.LocalTime;

public class Hotel implements Payable, Classifiable,Visitable{
    private String name;
    private int rank;
    private double price;
    LocalTime openingHour;
    LocalTime     closingHour;

    @Override
    public void setRank(int rank) {
      this.rank=rank;
    }
    public int getRank()
    {
        return this.rank;
    }

    @Override
    public void setPrice(double price){
        this.price= price;

    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setOHour(LocalTime open) {
        this.openingHour=open;
    }

    @Override
    public void setCHour(LocalTime close) {
     this.closingHour=close;
    }

    @Override
    public LocalTime getOHour() {
        return this.openingHour;
    }

    @Override
    public LocalTime getCHour() {
        return this.closingHour;
    }
}
