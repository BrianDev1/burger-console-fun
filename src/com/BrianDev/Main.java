package com.BrianDev;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /* Store all my hamburger orders */
        ArrayList<Hamburger> hamburgerOrders = new ArrayList<Hamburger>();

        /* Toppings to be added to an Array of Toppings to be past to Hamburger Class ---> (****) */
        Toppings tomato = new Toppings("Tomato");
        Toppings lettuce = new Toppings("Lettuce");
        Toppings onion = new Toppings("Onion");          //Step 1: Create Toppings of your preference
        Toppings onion2 = new Toppings("Onion");

        /* Custom Hamburger, using composition and Encapsulation */
        Hamburger myHamburger = new Hamburger(new Toppings[] {tomato,lettuce,onion,onion2}, new Bun("Sesame-seed", true), new Pattie("Beef", 2)); // <---- (****)
        hamburgerOrders.add(myHamburger);                                                           //Add burger to my orders arrayList

        /* Healthy Burger Inherits from Hamburger, and Overrides certain attributes */
        HealthyBurger myHealthBurger = new HealthyBurger(new Toppings[] {tomato,lettuce,onion,});
        hamburgerOrders.add(myHealthBurger);                                                        //Add burger to my orders arrayList

        DeluxeBurger myDeluxe = new DeluxeBurger();
        hamburgerOrders.add(myDeluxe);                                                              //Add burger to my orders arrayList

        /* Foreach utilizes Polymorphism  */
        for (Hamburger orderItem: hamburgerOrders) {
            orderItem.testNumberOfToppings();
            System.out.println(orderItem.addAdditions());
        }


    }
}
