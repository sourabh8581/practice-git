package com.darby.mycoolapp.controller;

import com.darby.mycoolapp.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
//    Injecting properties from application.properties file
//    @Value("${coach.name}")
//    private String coachName;
//    @Value("${team.name}")
//    private String teamName;
//    @GetMapping("/teamInfo")
//    public String getTeamInfo(){
//        return "Coach :"+ coachName +" Team :"+ teamName;
//    }
//    @GetMapping("/")
//    public String sayHello(){
//        return "Hello world";

//    }
    private Coach myCoach;
    @Autowired    // Constructor injection
    public FunRestController(@Qualifier("trackCoach") Coach theCoach){
        System.out.println("In Constructor :"+getClass().getSimpleName());
        myCoach = theCoach;

    }
  //  Setter Injection
//    @Autowired
//    public void setCoach(@Qualifier("trackCoach") Coach theCoach){         //We can give any method name
//        myCoach=theCoach;
//    }
    @GetMapping("/getdailyworkout")
    public String getDailyWorkout(){
        return this.myCoach.getDailyWorkout();
    }

}























