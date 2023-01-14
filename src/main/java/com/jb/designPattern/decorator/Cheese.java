package com.jb.designPattern.decorator;

public class Cheese implements PizzaBase{
    private PizzaBase pizza;

    public Cheese(PizzaBase pizza) {
        this.pizza = pizza;
    }

    /**
     * @return
     */
    @Override
    public int getCost() {
        return pizza.getCost() + 80;
    }

    /**
     * @return
     */
    @Override
    public String getDescription() {
        return pizza.getDescription() + " Cheese ";
    }
}
