package domain;

public class TV extends Product {
    public static final double PERCENT_TAX = 0.21;
    public TV(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcTax() {
        System.out.println("Calculating TV tax");
        return this.price * PERCENT_TAX;
    }
}
