package org.example;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

@Component
public class ProductService {

    public static ArrayList<Product> createService() {
        ArrayList<Product> prdctSrvc = new ArrayList<>();
        prdctSrvc.add(new Product(100, "Бельгийский стаут", 269.55));
        prdctSrvc.add(new Product(112, "IPA", 369.55));
        prdctSrvc.add(new Product(82, "Василеостровское светлое", 169.55));
        prdctSrvc.add(new Product(11, "Пять озёр", 450.05));
        prdctSrvc.add(new Product(236, "Белуга", 748.23));
        prdctSrvc.add(new Product(144, "Хортица", 588.44));
        prdctSrvc.add(new Product(74, "Красное", 777.77));
        prdctSrvc.add(new Product(489, "Белое", 777.78));
        prdctSrvc.add(new Product(326, "Портвейн", 1296.00));
        prdctSrvc.add(new Product(666, "Портвейн 777", 26.66));
        return prdctSrvc;
    }

    public static void printPS(ArrayList<Product> d) {
        d.sort(Product::compareTo);
        for (Product p : d)
            System.out.println(p);
    }

    public static Product search(ArrayList<Product> d) {
        System.out.println("Введи название товара ");
        Scanner vvod = new Scanner(System.in);
        String nameOfGood = vvod.nextLine();
        Product toRet = null;
        for (Product p : d) {
            if (Objects.equals(p.name, nameOfGood)) {
                System.out.println(p);
                toRet = p;
                break;
            }
        }
        return toRet;
    }
}