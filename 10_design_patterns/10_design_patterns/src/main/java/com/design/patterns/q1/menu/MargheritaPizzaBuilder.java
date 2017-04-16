package com.design.patterns.q1.menu;

import com.design.patterns.q1.ingredents.Cheese;
import com.design.patterns.q1.ingredents.Crust;
import com.design.patterns.q1.ingredents.Topping;

/**
 * Created by gauravv7 on 16/4/17.
 */
public class MargheritaPizzaBuilder extends PizzaBuilder {

    public MargheritaPizzaBuilder() {
        this.withCrust(Crust.STUFFED);

        this.withCheese(Cheese.AMERICAN);

        this.withTopping(Topping.TANGY_CHEESE);
    }
}
