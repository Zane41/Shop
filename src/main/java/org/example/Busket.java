package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Busket {

    ArrayList<Product> busket;

    public Busket(ArrayList<Product> busket) {
        this.busket = busket;
    }

    public static ArrayList<Product> putIntoBusket (Product p, ArrayList<Product> busket){
        System.out.println("Выберите товар для добавления в корзину ");
        busket.add(p);
        return busket;
    }
}
