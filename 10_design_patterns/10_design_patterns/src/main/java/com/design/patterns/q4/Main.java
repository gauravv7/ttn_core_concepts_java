package com.design.patterns.q4;

/**
 * Created by gauravv7 on 16/4/17.
 */
public class Main {

    public static void main(String[] args) {
        Ryu ryu = new Ryu();
        ryu.display(); ryu.kick(); ryu.punch(); ryu.roll(); ryu.jump();

        System.out.println();

        Ken ken = new Ken();
        ken.display(); ken.kick(); ken.punch(); ken.roll();
    }
}
