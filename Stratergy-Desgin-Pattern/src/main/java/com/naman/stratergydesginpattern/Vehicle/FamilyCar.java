package com.naman.stratergydesginpattern.Vehicle;

import com.naman.stratergydesginpattern.Strategy.EngineStrategy;
import com.naman.stratergydesginpattern.Strategy.NormalEngine;

public class FamilyCar extends Vehicle{
    public FamilyCar(EngineStrategy engineStrategy) {
        super(engineStrategy);
    }
}
