package domain;

public class Tomato extends Product {
    public static final double PERCENT_TAX = 0.06;

    public String expiryDate;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcTax() {
        System.out.println("Calculating PC tax");
        return this.price * PERCENT_TAX;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
