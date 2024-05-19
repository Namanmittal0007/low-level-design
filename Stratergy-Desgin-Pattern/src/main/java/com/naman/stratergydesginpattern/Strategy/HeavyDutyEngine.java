package com.naman.stratergydesginpattern.Strategy;

public class HeavyDutyEngine implements EngineStrategy {
    @Override
    public String drive() {
        return "Driving with Heavy Duty Engine";
    }
}
