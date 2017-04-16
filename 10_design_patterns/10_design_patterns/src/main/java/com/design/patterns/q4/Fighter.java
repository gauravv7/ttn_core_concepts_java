package com.design.patterns.q4;

/**
 * Created by gauravv7 on 16/4/17.
 */
public abstract class Fighter {

    private String name;

    Fighter(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Fighter name: "+this.name);
    }

    public void kick(){
        System.out.println("kick");
    }

    public void punch() {
        System.out.println("pinch");
    }

}
