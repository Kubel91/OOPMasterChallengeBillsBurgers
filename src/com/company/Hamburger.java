package com.company;

// TODO - Set "Additions" as class and correlating pricing as getters
// test

class DeluxeHamburger extends Hamburger {
    private String fries;
    private String drink;

    public DeluxeHamburger(String breadRollType, String meatType, String fries, String drink) {
        super(breadRollType, meatType);
        this.fries = fries;
        this.drink = drink;
    }

    double deluxePrice = 9.99;

    public void showPricing() {
        String output = "Deluxe Hamburger price with drink and fries = " + deluxePrice + " $";
        System.out.println(output);
    }
}

class HealthyBurger extends Hamburger {
    private boolean rucola;
    private boolean sesame;
    private double basePrice;

    public HealthyBurger(String breadRollType, String meatType, boolean rucola, boolean sesame) {
        super(breadRollType, meatType);
        this.basePrice = 4.99;
        this.rucola = rucola;
        this.sesame = sesame;

    }

    double rucolaPrice = 0.79;
    double sesamePrice = 0.79;
    double healthyTotal = total + rucolaPrice + sesamePrice;

    public void showPricing() {
        String output = "Healthy Burger Base price = " + basePrice + " $" + "\n" + "Lettuce = " + lettucePrice + " $" +
                "\n" + "Cheese = " + cheesePrice + " $" + "\n" + "Pickles = " + picklesPrice + " $" + "\n" +
                "Tomatoes = " + tomatoesPrice + " $" + "\n" + "Rucola = " + " $" + rucolaPrice + "\n" + "Sesame = "
                + sesamePrice + "\n" + "Total Price = " + healthyTotal + " $";
        System.out.println(output);
    }

    public void calculatePrice(boolean lettuce, boolean cheese, boolean pickles, boolean tomatoes, boolean rucola,
                               boolean sesame) {
        super.calculatePrice(lettuce, cheese, pickles, tomatoes);

        if (rucola) {
            orderedAdditions += rucolaPrice;
        }
        if (sesame) {
            orderedAdditions += sesamePrice;
        }
        System.out.println(this.basePrice + orderedAdditions);
    }
}

public class Hamburger {

    private String breadRollType;
    private String meatType;
    private boolean lettuce;
    private boolean cheese;
    private boolean pickles;
    private boolean tomatoes;

    public Hamburger(String breadRollType, String meatType) {
        this.breadRollType = "Wheat";
        this.meatType = "Beef";
    }

    double basePrice = 4.49;
    double lettucePrice = 0.19;
    double cheesePrice = 0.49;
    double picklesPrice = 0.39;
    double tomatoesPrice = 0.39;
    double total = basePrice + lettucePrice + cheesePrice + picklesPrice + tomatoesPrice;
    double orderedAdditions = 0;

    public void calculatePrice(boolean lettuce, boolean cheese, boolean pickles, boolean tomatoes) {

        if (lettuce) {
            orderedAdditions += lettucePrice;
        }
        if (cheese) {
            orderedAdditions += cheesePrice;
        }
        if (pickles) {
            orderedAdditions += picklesPrice;
        }
        if (tomatoes) {
            orderedAdditions += tomatoesPrice;
        }
        System.out.println(basePrice + orderedAdditions);
    }

    public void showPricing() {
        String output = "Hamburger Base price = " + basePrice + " $" + "\n" + "Lettuce = " + lettucePrice + " $" +
                "\n" + "Cheese = " + cheesePrice + " $" + "\n" + "Pickles = " + picklesPrice + " $" + "\n" +
                "Tomatoes = " + tomatoesPrice + " $" + "\n" + "Total Price = " + total + " $";
        System.out.println(output);
    }
}





