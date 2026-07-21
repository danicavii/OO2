
public class ComprarDolares implements Product {
	private double valorCompra=1400;
	
	public double Inversion (double montoInicial) {
		return this.valorCompra* montoInicial;
	}
}
