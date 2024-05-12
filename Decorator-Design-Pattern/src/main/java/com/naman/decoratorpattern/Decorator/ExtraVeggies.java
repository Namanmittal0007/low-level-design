package com.naman.decoratorpattern.Decorator;

import com.naman.decoratorpattern.Base.BasePizza;

public class ExtraVeggies implements ToppingDecorator{

    BasePizza basePizza;

    public ExtraVeggies(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+30;
    }
}
