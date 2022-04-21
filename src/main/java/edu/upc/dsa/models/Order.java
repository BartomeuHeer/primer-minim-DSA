package edu.upc.dsa.models;

import java.util.HashMap;

public class Order {
    enum state{
        ORDERED,
        DELIVERED
    }
    private int id;



    private HashMap<String,Integer> productQuant;


    public Order(int id) {
        this.id = id;
        productQuant = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<String, Integer> getProductQuant() {
        return productQuant;
    }

    public void setProductQuant(HashMap<String, Integer> productQuant) {
        this.productQuant = productQuant;
    }

    public void addLP(int quant, String product){
        productQuant.put(product,quant);
    }

    public int getQuantity(String prodName){
        return productQuant.get(prodName);
    }

}
