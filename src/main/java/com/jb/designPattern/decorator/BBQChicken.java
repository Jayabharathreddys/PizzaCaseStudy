package com.jb.designPattern.decorator;

public class BBQChicken implements PizzaBase{

    //no-args constructor as no previous object is required

    public BBQChicken() {
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
        return "BBQChicken";
    }
}
