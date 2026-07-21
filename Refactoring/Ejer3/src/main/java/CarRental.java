import java.time.LocalDate;

public class CarRental extends Product {
    private double cost; //public double cost; rompe el encapusalmiento  
    // private TimePeriod timePeriod;
    private Company company;

    public CarRental(double cost, TimePeriod timePeriod, Company company) {
        super(timePeriod);//this.timePeriod = timePeriod;
    	this.cost = cost;
        this.company = company;
    }

    //1Paso crear getters y setters
    
    public void setCost(double newcost) { 
    	this.cost = newcost;
    }
    
    public double cost() {
    	return this.cost;
    }
    /*public LocalDate startDate() {
        return this.timePeriod.start();
    }

    public LocalDate endDate() {
        return this.timePeriod.end();
    }*/

    public double price() {
        return this.company.total();
    }

}
