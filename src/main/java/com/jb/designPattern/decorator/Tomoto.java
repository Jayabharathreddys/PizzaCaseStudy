package com.jb.designPattern.decorator;

public class Tomoto implements PizzaBase{
    private PizzaBase pizza;

    public Tomoto(PizzaBase pizza) {
        this.pizza = pizza;
    }

    /**
     * @return
     */
    @Override
    public int getCost() {
        return pizza.getCost()+30;
    }

    /**
     * @return
     */
    @Override
    public String getDescription() {
        return pizza.getDescription()+ " Tomato ";
    }
}
