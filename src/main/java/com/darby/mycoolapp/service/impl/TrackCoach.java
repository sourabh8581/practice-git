package com.darby.mycoolapp.service.impl;

import com.darby.mycoolapp.service.Coach;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    public TrackCoach() {
        System.out.println("In Constructor :"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "A hard 5 km running";
    }
}
