package com.design.patterns.q1.menu;

import com.design.patterns.q1.ingredents.Cheese;
import com.design.patterns.q1.ingredents.Crust;
import com.design.patterns.q1.ingredents.Topping;

/**
 * Created by gauravv7 on 16/4/17.
 */
public class FarmHousePizzaBuilder extends PizzaBuilder {

    public FarmHousePizzaBuilder() {
        this.withCrust(Crust.STUFFED);

        this.withCheese(Cheese.AMERICAN);

        this.withTopping(Topping.PANNER);
        this.withTopping(Topping.TOMATO);
        this.withTopping(Topping.JALAPENO);
        this.withTopping(Topping.CAPSICUM);
    }
}
