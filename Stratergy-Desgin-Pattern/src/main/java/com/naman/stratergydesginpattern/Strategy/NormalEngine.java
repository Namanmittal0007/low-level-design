package com.naman.stratergydesginpattern.Strategy;

public class NormalEngine implements EngineStrategy{
    @Override
    public String drive() {
        return "Driving with normal Engine";
    }
}
