package com.company;

import java.time.LocalTime;

public interface Visitable {


    void setOHour(LocalTime open);
    void setCHour(LocalTime close );
    LocalTime getOHour();
    LocalTime getCHour();



}


