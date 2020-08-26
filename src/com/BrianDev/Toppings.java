package com.BrianDev;

public class Toppings {

    private String toppingName;
    private double toppingsPrice;


    public Toppings(String toppingName) {
        this.toppingName = toppingName;
        this.toppingsPrice = 0.50;
    }

    public String getToppingName() {
        return toppingName;
    }

    public double getToppingsPrice() {
        return toppingsPrice;
    }
}
