package com.company;

import java.time.LocalTime;

public class Restaurant implements Classifiable, Payable,Visitable{
    private String name;
    private int rank;
    private double price;
    LocalTime openingHour;
    LocalTime closingHour;

    @Override
    public void setRank(int rank) {

    }

    @Override
    public int getRank() {

        return rank;

    }

    @Override
    public void setPrice(double price) {
        this.price=price;

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
