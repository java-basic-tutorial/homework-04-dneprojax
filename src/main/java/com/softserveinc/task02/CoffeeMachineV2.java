package com.softserveinc.task02;

import com.softserveinc.task01.CoffeeMachineV1;

public class CoffeeMachineV2 extends CoffeeMachineV1 {
    private final int milkReservoirCapacity;

    private int milk;

    public CoffeeMachineV2(int coffeeBeanStorageCapacity, int waterReservoirCapacity, int wasteCoffeeBeanCapacity, int milkReservoirCapacity) {
        super(coffeeBeanStorageCapacity, waterReservoirCapacity, wasteCoffeeBeanCapacity);
        this.milkReservoirCapacity = milkReservoirCapacity;

    }

    public void addMilk(int milk) {
        this.milk = Math.min(milk + this.milk, milkReservoirCapacity);
    }

    public int getMilk() {
        return milk;
    }

    private boolean CoffeeWithMilk(int milk) {
        if (milk > this.milk) {
            System.err.println("Not enough milk");
            return false;
        }
        this.milk += milk;
        return true;

    }

    public boolean makeCappuccino() {
        if (makeEspresso() == true) {
            return CoffeeWithMilk(85);
        } else {
            return false;
        }

    }

    public boolean makeLatte() {
        if (makeEspresso() == true) {
            return CoffeeWithMilk(150);
        } else {
            return false;
        }

    }

}
