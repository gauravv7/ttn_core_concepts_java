package com.design.patterns.q1;

import com.design.patterns.q1.ingredents.Cheese;
import com.design.patterns.q1.ingredents.Crust;
import com.design.patterns.q1.ingredents.Topping;

import java.util.ArrayList;

/**
 * Created by gauravv7 on 16/4/17.
 */
public class Pizza {

    private float totalPrice = 0;

    private ArrayList<Topping> toppings= new ArrayList<>();
    private Crust crust=null;
    private Cheese cheese=null;

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(Topping topping) {
        this.toppings.add(topping);
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void addToPrice(float price) {
        this.totalPrice = totalPrice + price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "totalPrice=" + totalPrice +
                ", toppings=" + toppings +
                ", crust=" + crust +
                ", cheese=" + cheese +
                '}';
    }
}