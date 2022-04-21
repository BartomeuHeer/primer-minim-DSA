package edu.upc.dsa;


import edu.upc.dsa.models.*;

import java.util.*;

import org.apache.log4j.Logger;

public class ProductManagerImpl implements ProductManager {
    private List<Products> listProducts;
    private HashMap<User,Order> userOrderMap;
    private Queue<Order> orderQueue;
    private static ProductManagerImpl instance;
    final static Logger logger = Logger.getLogger(ProductManagerImpl.class);
    public static ProductManagerImpl getInstance(){
        logger.info(instance);
        if(instance == null)
            instance = new ProductManagerImpl();
        logger.info(instance);
        return instance;
    }

    private ProductManagerImpl() {
        listProducts = new LinkedList<>();
        userOrderMap = new HashMap<>();
        orderQueue = new ArrayDeque<>();
    }

    @Override
    public List<Products> getListProductsByPrice() {
        listProducts.sort(Comparator.comparingDouble(Products::getPrice));
        return listProducts;
    }

    @Override
    public List<Products> getListProductsBySells(){
        listProducts.sort(Comparator.comparingDouble(Products::getNumSells).reversed());
        return listProducts;
    }
    @Override
    public void addProduct(String id, double price,int sells){ listProducts.add(new Products(id,price,sells)); }

    @Override
    public void placeOrder(Order o,User u){
        orderQueue.add(o);
        //ficar al map orderuser
    }
    @Override
    public Order deliverOrder() {
        return orderQueue.poll();
    }
}
