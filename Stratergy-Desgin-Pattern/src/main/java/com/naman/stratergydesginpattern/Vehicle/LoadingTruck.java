package com.naman.stratergydesginpattern.Vehicle;

import com.naman.stratergydesginpattern.Strategy.EngineStrategy;
import com.naman.stratergydesginpattern.Strategy.HeavyDutyEngine;

public class LoadingTruck extends Vehicle{
    public LoadingTruck(EngineStrategy engineStrategy) {
        super(engineStrategy);
    }
}
