
public class AutoEnAlquiler {
	private double precioPorDia;
	private int cantidadPlazos;
	private String marca;
	private PoliticaCancelacion politica;
	
	public AutoEnAlquiler (double precioPorDia,int cant, String marca, PoliticaCancelacion politica) {
		this.precioPorDia=precioPorDia;
		this.cantidadPlazos=cant;
		this.marca=marca;
		this.politica= politica;
	}
	
	public void setPolitica(PoliticaCancelacion p) {
		this.politica=p;
	}
	
	public double getPrecioPorDia() {
		return this.precioPorDia;
	}
	
	public void setCancelacion(PoliticaCancelacion p) {
		this.politica=p;
	}
	public double getPolitica(Reserva r, int fechaCancelacion ) {
		return politica.calcularReembolso(r, fechaCancelacion);
	}
}
