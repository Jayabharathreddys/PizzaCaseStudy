package com.jb.designPattern.decorator;

public class Panner implements PizzaBase{
    private PizzaBase pizza;

    public Panner(PizzaBase pizza) {
        this.pizza = pizza;
    }
    /**
     * @return
     */
    @Override
    public int getCost() {
        return pizza.getCost() + 60;
    }

    /**
     * @return
     */
    @Override
    public String getDescription() {
        return pizza.getDescription() + "Panner";
    }
}
