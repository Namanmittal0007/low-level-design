package com.naman.decoratorpattern.Decorator;

import com.naman.decoratorpattern.Base.BasePizza;

public class ExtraCheese implements ToppingDecorator{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+20;
    }
}
