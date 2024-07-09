package domain;

public class PC extends Product {
    public static final double PERCENT_TAX = 0.21;
    public PC(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcTax() {
        System.out.println("Calculating PC tax");
        return this.price * PERCENT_TAX;
    }
}
