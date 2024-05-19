package com.naman.stratergydesginpattern.Strategy;

public class SportsEngine implements EngineStrategy{
    @Override
    public String drive() {
       return "Driving with Sports Engine";
    }
}
