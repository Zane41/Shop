package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Busket cart1 = context.getBean("cart1", Busket.class);
        ProductService list1 = context.getBean("service1", ProductService.class);
        OrderService order1 = context.getBean("order1", OrderService.class);


        ProductService.printPS(ProductService.createService());
        cart1.putIntoBusket(list1.search(list1.createService()));
        cart1.putIntoBusket(list1.search(list1.createService()));
        order1.doOrder(cart1);
        cart1.clearCart();

    }
}