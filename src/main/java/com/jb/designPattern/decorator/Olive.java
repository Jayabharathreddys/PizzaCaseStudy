package com.jb.designPattern.decorator;

public class Olive implements PizzaBase{
    private PizzaBase pizza;

    public Olive(PizzaBase pizza) {
        this.pizza = pizza;
    }

    /**
     * @return
     */
    @Override
    public int getCost() {
        return pizza.getCost()+ 20;
    }

    /**
     * @return
     */
    @Override
    public String getDescription() {
        return pizza.getDescription()+" Olive addons";
    }
}
