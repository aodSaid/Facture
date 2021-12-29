package com.saidou;

import java.util.HashMap;
import java.util.Map;

public class Bill {
private Customer customer;
private Delivery delivery;
private Map<Product,Integer> product ;

    public Bill(Customer customer, Delivery delivery) {
        this.customer=customer;
        this.delivery=delivery;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProduct() {
        return product;
    }

    public void addProduct(Product product,Integer quantity){
        try {
            this.product.put(product,quantity);
        }catch (NullPointerException e){
            return;
        }

}

    public void generate(Writer writer){

        writer.start();
        writer.writeLine("HomeShop compagnie");
        writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
        writer.writeLine("");
        writer.writeLine("Facture à l'attention de : ");
        writer.writeLine(customer.getFullname());
        writer.writeLine(customer.getAddress());
        writer.writeLine("");
        writer.writeLine("Mode de livraison : " + delivery.getInfo());
        writer.writeLine("");
        writer.writeLine("Produits : ");
        writer.writeLine("-----------------------------------------------------");
        try {
            product.forEach((product, quantity) -> {

                writer.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantity + " unité(s)");
                writer.writeLine(product.getDescription());
                writer.writeLine("");
            });
        }catch (NullPointerException e){
            return;
        }

            writer.writeLine("Livraison : " + delivery.getPrice());
            writer.writeLine("-----------------------------------------------------");
            writer.writeLine("Total : " + this.getTotal());
            writer.stop();
    }

    public double getTotal() {
        double total = delivery.getPrice();
        for (Map.Entry<Product, Integer> entry : product.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total;
    }
}
