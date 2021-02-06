package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Wheat", "Beef");
        HealthyBurger healthyburger = new HealthyBurger("Rye", "Chicken", true, true);
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Wheat", "Beef", "Fries",
                "Coke");

        hamburger.showPricing();
        healthyburger.showPricing();
        healthyburger.calculatePrice(true, true, true, true, true, true);
        hamburger.calculatePrice(true, true, true, true);
        deluxeHamburger.showPricing();
    }
}
