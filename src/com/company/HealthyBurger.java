package com.company;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy","Bacon", 5.67,"brown rye");
    }


    public void addHealthyAddition1(String addition1Name,double addition1Price){
        healthyExtra1Name = addition1Name;
        healthyExtra1Price += addition1Price;
    }

    public void addHealthyAddition2(String addition2Name,double addition2Price){
        healthyExtra2Name = addition2Name;
        healthyExtra2Price += addition2Price;
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}

