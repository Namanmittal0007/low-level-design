package com.naman.stratergydesginpattern.Vehicle;

import com.naman.stratergydesginpattern.Strategy.EngineStrategy;
import com.naman.stratergydesginpattern.Strategy.HeavyDutyEngine;

public class Bus extends Vehicle{
    public Bus(EngineStrategy engineStrategy) {
        super(engineStrategy);
    }
}
