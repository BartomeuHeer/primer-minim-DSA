package edu.upc.dsa;


import edu.upc.dsa.models.*;

import java.util.*;

import org.apache.log4j.Logger;

public class ProductManagerImpl implements ProductManager {
    private List<Products> productsList;
    //private HashMap<User,List<Order>> userOrderMap;
    private Queue<Order> orderQueue;
    private List<User> userList;
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
        productsList = new LinkedList<>();
        //userOrderMap = new HashMap<>();
        orderQueue = new ArrayDeque<>();
        userList = new LinkedList<>();
    }

    @Override
    public List<Products> getListProductsByPrice() {
        productsList.sort(Comparator.comparingDouble(Products::getPrice));
        return productsList;
    }

    @Override
    public List<Products> getListProductsBySells(){
        productsList.sort(Comparator.comparingDouble(Products::getNumSells).reversed());
        return productsList;
    }
    @Override
    public void addProduct(String id, double price,int sells){ productsList.add(new Products(id,price,sells)); }

    @Override
    public void addUser(int id, String name) {
        userList.add(new User(id,name));
    }

    @Override
    public void placeOrder(Order o,User u){
        orderQueue.add(o);
        if(userList.contains(u))

        else

    }
    @Override
    public Order deliverOrder() {
        Order order =  orderQueue.poll();
        for (String product: order.getProductQuant().keySet()) {

        }
    }
}
