package com.company;
import java.time.LocalTime;
public class Church implements Visitable{
private String name;
LocalTime openingHour;
LocalTime closingHour;


    @Override
    public void setOHour(LocalTime open) {
        this.openingHour=open;

    }
    public void setCHour(LocalTime close)
    {
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
