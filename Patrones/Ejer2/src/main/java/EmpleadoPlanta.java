
public class EmpleadoPlanta extends Empleado {
	private boolean casado;
	private int cantHijos;
	private int antiguedad;
	private double monto= 50000;
	private double montoCasado=5000;
	private double montoHijo=2000;
	private double montoAntiguedad= 2000;

	public EmpleadoPlanta(boolean EsCasado, int cantidadHijos, int antiguedad) {
		this.casado= EsCasado;
		this.cantHijos= cantidadHijos;
		this.antiguedad= antiguedad;
	}
	
	
	public double SueldoBasico() {
		return this.monto;
	}
	
	public double Adicional() {
		double total=0;
		if(this.casado) {
			total=+ this.montoCasado;
		}
		total=+ (this.cantHijos*this.montoHijo) + (this.antiguedad*this.montoAntiguedad);
		return total;
	}
}
