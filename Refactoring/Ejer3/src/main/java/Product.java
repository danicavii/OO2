import java.time.LocalDate;

public class Product {
	private TimePeriod timePeriod;
	
	public Product(TimePeriod time) {
		this.timePeriod= time;
	}

	public long getTimePeriodDuration() {
		return this.timePeriod.duration();
	}
	
	public LocalDate startDate() {
	     return this.timePeriod.start();
	}

	public LocalDate endDate() {
	    return this.timePeriod.end();
	}
}
