package edu.upc.dsa.models;

public class Products {
    String id;
    double price;
    int numSells;

    public int getNumSells() {
        return numSells;
    }

    public void setNumSells(int numSells) {
        this.numSells = numSells;
    }

    public Products(String id, double price, int sells) {
        this.id = id;
        this.price = price;
        this.numSells = sells;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




}
