package com.saidou;

public class Product {
    String name;
    String description;
    double price;

    public Product(String name,String description,double price) {
        this.name=name;
        this.description=description;
        this.price=price;
    }

    /**
     *
     */


    public void look(){
        System.out.println(String.format(name + " : " + price + "%n" + description));
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }



    /**
     *
     * @param bill
     * @param quantity
     */
    public void buy(Bill bill, Integer quantity){

    }
}
