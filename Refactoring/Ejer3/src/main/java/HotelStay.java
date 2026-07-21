
import java.time.LocalDate;

public class HotelStay extends Product {
    private  double quote; //public double cost; rompe encapsulamiento
    //private TimePeriod timePeriod;
    private Hotel hotel;

    public HotelStay (double cost, TimePeriod timePeriod, Hotel hotel) {
    	super(timePeriod);//this.timePeriod = timePeriod; para realizar el PullUpMethod
    	this.quote= cost;
        this.hotel = hotel;
    }

    public double getCost() {// crear getter y setter
    	return this.quote;
    }
    
    public void setCost(double newCost) {
    	this.quote= newCost;
    }
    /*public LocalDate startDate() {
        return this.timePeriod.start(); para realizar el PullUpMethod
    }

    public LocalDate endDate() {
        return this.timePeriod.end();
    }*/

    public double priceFactor() {
        return this.quote / this.price();//Rename de cost a quote , se deberi cambiar todo los cost de la clase
    }

    public double price() {
        return super.getTimePeriodDuration() * this.hotel.totalPrice(); // super para el  PullUpMethod
    }
}

