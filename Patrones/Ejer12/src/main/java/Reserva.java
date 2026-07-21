
public class Reserva {
	private int cantDias;
	private int fecha;
	private Usuario Usuario;
	private AutoEnAlquiler Auto;
	
	public Reserva(int cant, int fecha) {
		this.cantDias=cant;
		this.fecha=fecha;
	}
	
	public Usuario getUsuario() {
		return this.Usuario;
	}
	public int getFechaReserva() {
		return this.fecha;
	}

	public double montoAPagar() {
		return this.cantDias * this.Auto.getPrecioPorDia();
	}
	
	public double montoAReembolsar(int fechaCancelacion) {
		return Auto.getPolitica(this, fechaCancelacion);
	}
}
