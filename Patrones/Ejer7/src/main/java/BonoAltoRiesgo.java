
public class BonoAltoRiesgo  implements Product{
	private double variacionMaxima =0.70;
	private int parking;
	
	public BonoAltoRiesgo(int Parking) {
		this.parking=parking;
	}
	
	public double Inversion(double montoInicial) {
		return  montoInicial+(montoInicial* this.variacionMaxima);
	}
}
