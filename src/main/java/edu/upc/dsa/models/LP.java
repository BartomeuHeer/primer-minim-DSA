package edu.upc.dsa.models;

import java.util.List;

public class LP {
    private int quantity;
    private Product product;

    public LP(String p,int q){
        this.quantity = q;
        this.product = new Product(p);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
