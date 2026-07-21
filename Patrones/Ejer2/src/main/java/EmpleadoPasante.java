
public class EmpleadoPasante extends Empleado {
	private int cantExamenes;
	private double monto=20000;
	
	public EmpleadoPasante(int cantidadExamenes) {
		this.cantExamenes= cantidadExamenes;
	}
	
	public double SueldoBasico() {
		return this.monto;
	}
	
	public double Adicional() {
		return this.cantExamenes * 2000;
	}
}
