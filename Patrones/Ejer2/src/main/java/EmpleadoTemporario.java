
public class EmpleadoTemporario extends Empleado{
	private int cantHoras;
	private boolean casado;
	private int cantHijos;
	private double monto= 20000;
	private double montoCasado=5000;
	private double montoHijo=2000;
	
	public EmpleadoTemporario(int cantidadHoras, int cantidadHijos,boolean esCasado) {
		this.cantHoras= cantidadHoras;
		this.casado= esCasado;
		this.cantHijos= cantidadHijos;
	}
	
	public double SueldoBasico() {
		return this.monto + (this.cantHoras*300);
	}
	
	public double Adicional() {
		double total = 0;
		if(this.casado) {
			total =+ this.montoCasado;
		}
		total =+ this.cantHijos* this.montoHijo;
		return total;
	}
}
