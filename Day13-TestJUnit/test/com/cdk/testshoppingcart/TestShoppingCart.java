package com.cdk.testshoppingcart;

import com.cdk.shoppingcart.ItemNotFoundException;
import com.cdk.shoppingcart.Product;
import com.cdk.shoppingcart.ShoppingCartService;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

/**
 * Created by chhedab on 8/2/2017.
 */
public class TestShoppingCart {
    @Test
    public void testaddItemWhenItemAdded(){
        ShoppingCartService shoppingCartService = new ShoppingCartService();
        shoppingCartService.addItem(new Product(133,"Soap",50.00,3));
        Collection<Product> products = shoppingCartService.showCartDetails();
        for (Product product : products) {
            if(product.getName().equals("Soap")){
                if(product.getQty() == 3){
                    System.out.println("Items added successfully");
                } else {
                    System.out.println("Inaccurate number of Items");
                }
            } else{
                System.out.println("Item not found");
            }
        }
    }

    @Test
    public void testremoveSelectedItem(){
        ShoppingCartService shoppingCartService = new ShoppingCartService();
        shoppingCartService.addItem(new Product(45, "Chocolates", 72, 3));
        shoppingCartService.addItem(new Product(42, "Maggi", 12, 13));
        shoppingCartService.addItem(new Product(48, "Cookies", 42, 9));
        Collection<Product> products = shoppingCartService.showCartDetails();
        try {
            shoppingCartService.removeItem(42);
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckEmptyCart(){
        ShoppingCartService shoppingCartService = new ShoppingCartService();
        shoppingCartService.addItem(new Product(12, "Chocolate",75,2));
        shoppingCartService.emptyCart();
        Collection<Product> products = shoppingCartService.showCartDetails();
        for(Product product : products){
            if(product == null){
                System.out.println("Cart successfully Empty");
            }
        }
    }

    @Test
    public void testShowEmptyCartDetails(){
        ShoppingCartService shoppingCartService = new ShoppingCartService();
        Collection<Product> products = shoppingCartService.showCartDetails();
        for(Product product : products){
            if(product == null){
                System.out.println("Empty cart showing no details");
            } else{
                System.out.println("Test not working");
            }
        }
    }
    @Test
    public void testTotalPrice(){
        ShoppingCartService shoppingCartService = new ShoppingCartService();
        shoppingCartService.addItem(new Product(12,"Shampoo",100,4));
        Assert.assertEquals(400.00,shoppingCartService.totalPrice(),2);
    }
    @Test
    public void testCountItems(){
        ShoppingCartService shoppingCartService = new ShoppingCartService();
        shoppingCartService.addItem(new Product(34, "Chocolates",50,10));
        Assert.assertEquals("Inaccurate quantity of items",10,shoppingCartService.countItems());
    }

}
