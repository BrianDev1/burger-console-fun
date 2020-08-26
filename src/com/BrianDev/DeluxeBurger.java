package com.BrianDev;

public class DeluxeBurger extends Hamburger {

    private double basePrice;
    private String deluxeAddition01;
    private String deluxeAddition02;
    private int numberOfToppings;



    public DeluxeBurger() {
        super(new Toppings[] {} /* No toppings */, new Bun("Sesame-seed", true), new Pattie("Beef", 2));
        this.basePrice = 7.00;
        this.deluxeAddition01 = "Chips";
        this.deluxeAddition02 = "Drink";
        this.numberOfToppings = 0;
    }


    @Override
    public void testNumberOfToppings() {
        super.testNumberOfToppings();
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public String getDeluxeAddition01() {
        return deluxeAddition01;
    }

    public String getDeluxeAddition02() {
        return deluxeAddition02;
    }

    @Override
    public String addAdditions() {
        return super.addAdditions() + String.format("----------------------\nAdd-ons:\nItem: %s  $Free\nItem: %s  $Free\n", getDeluxeAddition01(), getDeluxeAddition02());
    }

    @Override
    public double getBasePrice() {
        return basePrice;
    }
}
