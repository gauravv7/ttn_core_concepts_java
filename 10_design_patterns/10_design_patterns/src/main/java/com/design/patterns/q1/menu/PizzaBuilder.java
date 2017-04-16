package com.design.patterns.q1.menu;

import com.design.patterns.q1.Pizza;
import com.design.patterns.q1.ingredents.Cheese;
import com.design.patterns.q1.ingredents.Crust;
import com.design.patterns.q1.ingredents.Topping;

/**
 * Created by gauravv7 on 16/4/17.
 */
public abstract class PizzaBuilder {

    private Pizza pizza = new Pizza();

    public PizzaBuilder withTopping(Topping topping) {
        this.pizza.setToppings(topping);
        this.pizza.addToPrice(topping.getCost());
        return this;
    }

    public PizzaBuilder withCrust(Crust crust) {
        this.pizza.setCrust(crust);
        this.pizza.addToPrice(crust.getCost());
        return this;
    }

    public PizzaBuilder withCheese(Cheese cheese) {
        this.pizza.setCheese(cheese);
        this.pizza.addToPrice(cheese.getCost());
        return this;
    }

    public Pizza build() {
        if(this.pizza.getCrust()==null){
            throw new IllegalStateException("please select a crust");
        }
        if(this.pizza.getCheese()==null){
            throw new IllegalStateException("please select a cheese");
        }
        if(this.pizza.getToppings().isEmpty()){
            throw new IllegalStateException("please select a topping");
        }
        return this.pizza;
    }

    public double calculatePrice() {
        return this.pizza.getTotalPrice();
    }

}
