package com.BrianDev;

public class HealthyBurger extends Hamburger {

    private double basePrice;
    private int numberOfToppings;

    public HealthyBurger(Toppings[] additionalToppings) {
        super(additionalToppings, new Bun("Brown Rye", false), new Pattie("Chicken",1));
        this.basePrice = 4.30;
        this.numberOfToppings = 6;

    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    @Override
    public void testNumberOfToppings() {
        super.testNumberOfToppings();
    }

    @Override
    public String addAdditions() {
        return super.addAdditions();
    }


    public double getBasePrice() {
        return basePrice;
    }
}
