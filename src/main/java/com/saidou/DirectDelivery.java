package com.saidou;

public class DirectDelivery implements Delivery{
    @Override
    public double getPrice() {
        return 4.99;
    }

    @Override
    public String getInfo() {
        return "Livraison à Domicile: 4.99";
    }
}
