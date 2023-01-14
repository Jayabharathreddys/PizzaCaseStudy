package com.jb.designPattern.decorator;

public class Pepperoni implements PizzaBase{

    //no-args constructor as no previous object is required


    public Pepperoni() {
    }

    /**
     * @return
     */
    @Override
    public int getCost() {
        return 180;
    }

    /**
     * @return
     */
    @Override
    public String getDescription() {
        return "Pepperoni";
    }
}
