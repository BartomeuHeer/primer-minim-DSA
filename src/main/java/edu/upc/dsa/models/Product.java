package edu.upc.dsa.models;

public class Product {
    private String id;
    private double price;
    private int numSells;

    public Product(String id, double price) {
        this.id = id;
        this.price = price;
        this.numSells = 0;
    }
    public Product(String id) {
        this.id = id;
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

    public int getNumSells() {
        return numSells;
    }

    public void setNumSells(int numSells) {
        this.numSells = numSells;
    }

    public void addNumSells(int sells){
        this.numSells =+ sells;
    }
}
