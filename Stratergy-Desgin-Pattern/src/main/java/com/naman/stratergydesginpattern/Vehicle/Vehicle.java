package com.naman.stratergydesginpattern.Vehicle;

import com.naman.stratergydesginpattern.Strategy.EngineStrategy;

public class Vehicle {
    EngineStrategy engineStrategy;

    public Vehicle(EngineStrategy engineStrategy) {
        this.engineStrategy = engineStrategy;
    }

    public String drive(){
        return engineStrategy.drive();
    }
}
