package com.company;

import java.time.LocalTime;

public class Museum implements Visitable, Payable{
   private String name;
   private double price;
 LocalTime openingHour;
 LocalTime closingHour;


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

    }


 @Override
 public void setCHour(LocalTime close) {


 }

 @Override
 public LocalTime getOHour() {
  return this.openingHour;
 }

 @Override
 public LocalTime getCHour() {
  return null;
 }
}
