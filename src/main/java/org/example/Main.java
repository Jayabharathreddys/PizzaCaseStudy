package org.example;

import com.jb.designPattern.decorator.*;

public class Main {
    public static void main(String[] args) {
        PizzaBase p = new Panner(new Cheese( new Tomoto( new BBQChicken())));

        System.out.println(p.getCost());
        System.out.println(p.getDescription());
    }
}