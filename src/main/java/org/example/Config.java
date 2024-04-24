package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;


import static org.example.ProductService.createService;

@Configuration
public class Config {
    @Bean (name = "cart1")
    public Busket createBusket(){
        return new Busket();
    }

    @Bean (name = "order1")
    public OrderService doOrder1(){
        return new OrderService();
    }
    @Bean (name = "service1")
    public ProductService list1(){
        return new ProductService();
    }
}
