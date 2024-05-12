package com.naman.decoratorpattern;

import com.naman.decoratorpattern.Base.BasePizza;
import com.naman.decoratorpattern.Base.MargheritaPizza;
import com.naman.decoratorpattern.Decorator.ExtraCheese;
import com.naman.decoratorpattern.Decorator.ExtraVeggies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecoratorPatternApplication.class, args);
        findPizzaCost();
    }
    static void findPizzaCost(){
        BasePizza margheritaPizza = new MargheritaPizza();
        System.out.println("Pizza Cost(Margherita) : " + margheritaPizza.cost());

//        Adding Extra cheese to margherita pizza
        BasePizza extraCheese_MargheritaPizza = new ExtraCheese(margheritaPizza);
        System.out.println("Pizza Cost(Margherita+ExtraCheese) : " + extraCheese_MargheritaPizza.cost());

//        Adding Extra veggies to margherita pizza
        BasePizza extraVeggies_MargheritaPizza = new ExtraVeggies(margheritaPizza);
        System.out.println("Pizza Cost(Margherita+ExtraVeggies) : " + extraVeggies_MargheritaPizza.cost());

//        Adding Extra Cheese and Extra veggies to margherita pizza
        BasePizza extraCheese_extraVeggies_MargheritaPizza = new ExtraVeggies(new ExtraCheese(new MargheritaPizza()));
        System.out.println("Pizza Cost(Margherita+Cheese+Veggies) : " + extraCheese_extraVeggies_MargheritaPizza.cost());

//        Adding Double Extra Cheese
        BasePizza doubleExtraCheese_MargheritaPizza = new ExtraCheese(new ExtraCheese(new MargheritaPizza()));
        System.out.println("Pizza Cost(Margherita+Cheese+Veggies) : " + doubleExtraCheese_MargheritaPizza.cost());
    }

}
