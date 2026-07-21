
public class Hotel {
    private double nightPrice;
    private double discountRate;

    public Hotel(double nightPrice, double discountRate) {
        this.nightPrice = nightPrice;
        this.discountRate = discountRate;
    }

    public double totalPrice() {
    	return this.getNightPrice()*this.getDiscountRate();
    }
    public double getNightPrice() {
        return this.nightPrice;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }
}

