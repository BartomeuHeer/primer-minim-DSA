package edu.upc.dsa;

import edu.upc.dsa.models.Products;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProductManagerTest {
    ProductManager pm;
    @Before
    public void setUp(){
        pm=ProductManagerImpl.getInstance();
        pm.addProduct("donetes", 1.5,2);
        pm.addProduct("donuts", 1.2,4);
        pm.addProduct("cola",2,3);
    }

    @Test
    public void testGetProducts(){
        List<Products> products = pm.getListProductsByPrice();
        assertEquals("donuts", products.get(0).getId());
        assertEquals("donetes", products.get(1).getId());
        assertEquals("cola", products.get(2).getId());
        products = pm.getListProductsBySells();
        assertEquals("donuts", products.get(0).getId());
        assertEquals("cola", products.get(1).getId());
        assertEquals("donetes", products.get(2).getId());
    }
}
