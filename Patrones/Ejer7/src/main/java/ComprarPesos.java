
public class ComprarPesos implements Product {
	private double valorCompra=1370;
	
	public double Inversion(double montoInicial) {
		return this.valorCompra*montoInicial;
	}
}
