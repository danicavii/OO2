
public class PlazoFijo implements Product {
	private int cantDias;
	private double intereses;
	
	public PlazoFijo(int minPlazo, double tasa) {
		this.cantDias=minPlazo;
		this.intereses=tasa;
	}
	
	public double Inversion(double montoInicial) {
		return (this.intereses* this.cantDias)*montoInicial;
	}
}
