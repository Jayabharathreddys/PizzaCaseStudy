package com.jb.designPattern.decorator;

public class Margherita implements PizzaBase{

    //no-args constructor as no previous object is required

    public Margherita() {
    }

    /**
     * @return
     */
    @Override
    public int getCost() {
        return 200;
    }

    /**
     * @return
     */
    @Override
    public String getDescription() {
        return "Margherita";
    }
}
