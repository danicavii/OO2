
public abstract class Empleado {
	private double DescuentoBasico = 0.13;
	private double DescuentoAdicional = 0.05;
	
	public Empleado() {
		
	}
	
	public double sueldo() {
	
		return this.SueldoBasico() + this.Adicional() - this.descuento();
	}
	
	protected abstract double SueldoBasico();
	
	protected abstract double Adicional();
	
	public double descuento() {
		return (this.SueldoBasico()*this.DescuentoBasico) + (this.Adicional()*this.DescuentoAdicional);
	}
}
