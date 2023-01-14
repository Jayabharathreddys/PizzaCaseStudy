package com.jb.designPattern.decorator;

public class Farmhouse implements PizzaBase{

    //no-args constructor as no previous object is required
    public Farmhouse() {
    }

    /**
     * @return
     */
    @Override
    public int getCost() {
        return 150;
    }

    /**
     * @return
     */
    @Override
    public String getDescription() {
        return "Farmhouse";
    }
}
