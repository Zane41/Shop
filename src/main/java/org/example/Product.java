package org.example;



public class Product implements Comparable<Product> {
    int id; String name; double cost;

    public Product(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return STR."Product{id=\{id}, name='\{name}\{'\''}, cost=\{cost}\{'}'}";
    }

    @Override
    public int compareTo(Product p1) {
        if (this.id>p1.id) return 1;
        else return -1;
    }

}
