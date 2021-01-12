package com.weather.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("OPTIMAL_CONDITIONS")
public class OptimalConditions extends Weather {

    private OptimalConditions(){

    }

    public OptimalConditions (int day) {
        this.day= day;
    }
}
