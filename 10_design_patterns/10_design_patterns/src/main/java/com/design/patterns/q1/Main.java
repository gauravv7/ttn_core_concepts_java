package com.design.patterns.q1;

import com.design.patterns.q1.ingredents.Topping;
import com.design.patterns.q1.menu.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by gauravv7 on 16/4/17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Please select a pizza from the following categories");
        System.out.println("1. Peppy Paneer, 2. Farmhouse, 3. Margherita, 4. Chicken Fiesta");
        Scanner sc = new Scanner(System.in);
        int nPizza = Integer.parseInt(sc.nextLine());

        Pizza pizza = null;
        ArrayList<Topping> toppings;

        switch(nPizza){
            case 1:
                PizzaBuilder peppyPannerPizzaBuilder = new PeppyPannerPizzaBuilder();
                toppings = getToppings(sc);
                if(toppings!=null){
                    for (Topping t: toppings){
                        peppyPannerPizzaBuilder.withTopping(t);
                    }
                }
                pizza = peppyPannerPizzaBuilder.build();
                break;
            case 2:
                PizzaBuilder farmHousePizzaBuilder = new FarmHousePizzaBuilder();
                toppings = getToppings(sc);
                if(toppings!=null){
                    for (Topping t: toppings){
                        farmHousePizzaBuilder.withTopping(t);
                    }
                }
                pizza = farmHousePizzaBuilder.build();
                break;
            case 3:
                PizzaBuilder margheritaPizzaBuilder = new MargheritaPizzaBuilder();
                toppings = getToppings(sc);
                if(toppings!=null){
                    for (Topping t: toppings){
                        margheritaPizzaBuilder.withTopping(t);
                    }
                }
                pizza = margheritaPizzaBuilder.build();
                break;
            case 4:
                PizzaBuilder chickenPizzaBuilder = new ChickenPizzaBuilder();
                toppings = getToppings(sc);
                if(toppings!=null){
                    for (Topping t: toppings){
                        chickenPizzaBuilder.withTopping(t);
                    }
                }
                pizza = chickenPizzaBuilder.build();
                break;
            default:
                System.out.println("invalid choice of pizza");
        }

        System.out.println("your pizza is: "+pizza.toString());
        System.out.println("Total Price: "+pizza.getTotalPrice());

    }

    private static ArrayList<Topping> getToppings(Scanner sc) {
        char ch = 'n';
        ArrayList<Topping> toppings = null;
        do{
            System.out.println("Add additional toppings?(y/n)");
            ch = sc.nextLine().charAt(0);
            if(ch=='n') break;
            System.out.println("1. TOMATO, 2. PANNER, 3. JALAPENO, 4. CAPSICUM, 5. TANGY_CHEESE, 6. CHICKEN");
            System.out.println("Enter your choice: ");
            int nToppings = Integer.parseInt(sc.nextLine());
            if(toppings==null && ch=='y'){
                toppings = new ArrayList<>();
            }
            switch (nToppings){
                case 1:
                    toppings.add(Topping.TOMATO);
                    break;
                case 2:
                    toppings.add(Topping.PANNER);
                    break;
                case 3:
                    toppings.add(Topping.JALAPENO);
                    break;
                case 4:
                    toppings.add(Topping.CAPSICUM);
                    break;
                case 5:
                    toppings.add(Topping.TANGY_CHEESE);
                    break;
                case 6:
                    toppings.add(Topping.CHICKEN);
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }while(ch=='y');
        return toppings;
    }
}
