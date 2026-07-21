
public class BonoBajoRiesgo implements Product {
	private double variacionMaxima =0.10;
	private int parking;
	
	public BonoBajoRiesgo(int Parking) {
		this.parking=parking;
	}
	
	public double Inversion(double montoInicial) {
		return  montoInicial+(montoInicial* this.variacionMaxima);
	}
}
