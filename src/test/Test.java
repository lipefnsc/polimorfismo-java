package test;

import domain.PC;
import domain.Product;
import domain.Tomato;
import service.CalcTax;

public class Test {
    public static void main(String[] args) {
        Product pc = new PC("Example pc", 11000);
        Tomato tomato = new Tomato("American tomato", 20);
        tomato.setExpiryDate("11/12/2021");

        CalcTax.calculateTax(pc);
        System.out.println("--------------");
        CalcTax.calculateTax(tomato);
    }
}
