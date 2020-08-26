package com.BrianDev;

public class Hamburger {

    private Toppings [] additionalToppings;
    private double basePrice;
    private double finalPrice;
    private Bun theBun;
    private Pattie thePattie;
    private int numberOfToppings;


    public Hamburger(Toppings [] additionalToppings, Bun theBun, Pattie thePattie) {

        this.additionalToppings = additionalToppings;
        this.basePrice = 5.00;
        this.finalPrice = 0.0;
        this.theBun = theBun;
        this.thePattie = thePattie;
        this.numberOfToppings = 4;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    /* Just for Test, not implemented */
    public void testNumberOfToppings () {
        try {
            if (additionalToppings.length <= getNumberOfToppings())
            {
                System.out.println("You entered " + additionalToppings.length + " toppings so, you have " + (getNumberOfToppings() - additionalToppings.length) + " remaining");
            } else {
                additionalToppings = new Toppings [] {};
            }
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String addAdditions() {
        double totalToppingPrice = 0;
        for(Toppings topping: additionalToppings) {
            totalToppingPrice += topping.getToppingsPrice();
        }

        finalPrice = totalToppingPrice + getBasePrice();
        return orderDetails(totalToppingPrice);
    }

    private String orderDetails(double toppingTotalPrice){
        String orderPart1;
        String orderPart2 = "";
        String orderPart3;
        orderPart1 =  String.format("Your order:\nBun: %s %s\nPattie: %s x%s\n", theBun.getBunType(),theBun.getIsToasted(),thePattie.getType(),thePattie.getQuantity());
        for (Toppings topping: additionalToppings) {
            orderPart2 += String.format("Topping: %s  Price: $%s\n",topping.getToppingName(),topping.getToppingsPrice());
        }
        
        orderPart3 = String.format("----------------------\nToppings total: $%s\nBase Price: $%s\nTotal Amount Due: $%s\n",toppingTotalPrice, getBasePrice(),  getFinalPrice());

        return orderPart1 + orderPart2 + orderPart3;

    }

    private double getFinalPrice() {
        return finalPrice;
    }
}
