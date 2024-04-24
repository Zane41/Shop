package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class OrderService {

    public void doOrder (Busket cart){
        double sumPrice =0;
        for (Product product:cart.busket) {
            sumPrice += product.cost;
            System.out.println(product);
        }
        System.out.println("Общая стоимость: "+sumPrice);
    }


}
