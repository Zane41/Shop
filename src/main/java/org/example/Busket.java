package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Busket {


    ArrayList<Product> busket = new ArrayList<>();



    public  Busket putIntoBusket (Product p, Busket cart){
        System.out.println("Выберите товар для добавления в корзину ");
        cart.busket.add(p);
        return cart;
    }
    public Busket clearCart (Busket cart){
        cart.busket.clear();
        return cart;
    }
}
