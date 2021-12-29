package com.saidou;

public class Fridge extends Product{

    private Integer liter;
    private boolean freezer;

    public Fridge(String name, String description, double price,Integer liter,boolean freezer) {
        super(name, description, price);
        this.liter=liter;
        this.freezer=freezer;
    }

    public Integer getLiter() {
        return liter;
    }

    public boolean isFreezer() {
        return freezer;
    }
}
