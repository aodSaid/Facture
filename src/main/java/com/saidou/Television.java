package com.saidou;

public class Television extends Product{

    private  Integer size;
    private  String slabType;

    public Television(String name, String description, double price, Integer size, String slabType) {
        super(name, description, price);
        this.slabType=slabType;
        this.size=size;
    }

    public Integer getSize() {
        return size;
    }

    public String getSlabType() {
        return slabType;
    }
}
