package com.naman.stratergydesginpattern.Vehicle;

import com.naman.stratergydesginpattern.Strategy.EngineStrategy;
import com.naman.stratergydesginpattern.Strategy.SportsEngine;

public class RacingCar extends Vehicle{
    public RacingCar(EngineStrategy engineStrategy) {
        super(engineStrategy);
    }
}
