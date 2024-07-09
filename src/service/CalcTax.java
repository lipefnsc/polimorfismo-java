package service;

import domain.Product;
import domain.Tomato;

public class CalcTax {

    public static void calculateTax(Product product){
        System.out.println("Tax report");
        double tax = product.calcTax();
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax: " + tax);
        if(product instanceof Tomato tomato) {
            System.out.println(tomato.getExpiryDate());
        }
    }

}
