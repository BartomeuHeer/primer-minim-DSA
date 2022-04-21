package edu.upc.dsa;

import edu.upc.dsa.models.*;

import java.util.List;

public interface ProductManager {

    public void addProduct(String id,double price,int sells);
    public List<Products> getListProductsByPrice();
    public List<Products> getListProductsBySells();
    public Order deliverOrder();
    public void placeOrder(Order o,User u);
    public void addUser(int id,String name);
}
