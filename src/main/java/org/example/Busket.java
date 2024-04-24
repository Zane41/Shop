package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Busket {


    ArrayList<Product> busket = new ArrayList<>();



    public  void putIntoBusket (Product p ){
        System.out.println("Выберите товар для добавления в корзину ");
        busket.add(p);

    }
    public void clearCart (){
        busket.clear();
    }
}
