package com.naman.stratergydesginpattern;

import com.naman.stratergydesginpattern.Strategy.HeavyDutyEngine;
import com.naman.stratergydesginpattern.Strategy.NormalEngine;
import com.naman.stratergydesginpattern.Strategy.SportsEngine;
import com.naman.stratergydesginpattern.Vehicle.Bus;
import com.naman.stratergydesginpattern.Vehicle.FamilyCar;
import com.naman.stratergydesginpattern.Vehicle.LoadingTruck;
import com.naman.stratergydesginpattern.Vehicle.RacingCar;
import com.naman.stratergydesginpattern.Vehicle.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StratergyDesginPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(StratergyDesginPatternApplication.class, args);
        drive();
    }
    static void drive(){
//      With strategy design pattern we can change engine strategy dynamically, i.e. change the behavior of the object
        Vehicle familyCar = new FamilyCar(new NormalEngine());
        Vehicle racingCar = new RacingCar(new SportsEngine());
        Vehicle bus = new Bus(new HeavyDutyEngine());
        Vehicle truck = new LoadingTruck(new HeavyDutyEngine());
        System.out.println("Family car : " + familyCar.drive());
        System.out.println("Racing car : " + racingCar.drive());
        System.out.println("Bus : " + bus.drive());
        System.out.println("Loading Truck : " + truck.drive());
    }

}
