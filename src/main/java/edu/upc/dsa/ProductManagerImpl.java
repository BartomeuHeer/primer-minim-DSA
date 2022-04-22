package edu.upc.dsa;


import edu.upc.dsa.models.*;

import java.util.*;

import org.apache.log4j.Logger;

public class ProductManagerImpl implements ProductManager {
    //contenidors
    private List<Product> productsList;
    private Queue<Order> orderQueue;
    HashMap<String,User> userByID;
    //instancia
    private static ProductManagerImpl instance;
    //logs
    final static Logger logger = Logger.getLogger(ProductManagerImpl.class);

    private ProductManagerImpl() {
        productsList = new LinkedList<>();
        orderQueue = new ArrayDeque<>();
        userByID = new HashMap<>();
    }
    public static ProductManagerImpl getInstance(){
        //logger.info(instance);
        if(instance == null)
            instance = new ProductManagerImpl();
        //logger.info(instance);
        return instance;
    }

    @Override
    public List<Product> getListProductsByPrice() {
        productsList.sort(Comparator.comparingDouble(Product::getPrice));
        return productsList;
    }

    @Override
    public List<Product> getListProductsBySells(){
        productsList.sort(Comparator.comparingDouble(Product::getNumSells).reversed());
        return productsList;
    }
    @Override
    public void addProduct(String id, double price){ productsList.add(new Product(id,price)); }

    @Override
    public void placeOrder(Order o,String u){
        o.addUser(u);
        orderQueue.add(o);
    }
    @Override
    public Order deliverOrder() {
        Order o = orderQueue.poll();
        User u = userByID.get(o.getUser());
        for (LP lp: o.getProductQuant())
            productsList.get(productsList.indexOf(lp.getProduct())).addNumSells(lp.getQuantity());
        return o;
    }
}
