package com.darby.mycoolapp.service.impl;

import com.darby.mycoolapp.service.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Primary     // Since there were multiple implementations, making this one to be primary to avoid ambiguity
@Component
@Lazy      // Beans of this will be created only if required for dependency injection
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In Constructor :"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Get bowling practice for 15 min";
    }
}
