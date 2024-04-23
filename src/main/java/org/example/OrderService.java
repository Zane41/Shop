package org.example;


import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class OrderService {
    public static void doOrder (ArrayList<Product> busket){
        double sumPrice =0;
        for (Product product:busket) {
            sumPrice += product.cost;
            System.out.println(product);
        }
        System.out.println("Общая стоимость: "+sumPrice);
    }
}
