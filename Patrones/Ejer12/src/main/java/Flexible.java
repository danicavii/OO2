
public class Flexible {

	public  double calcularReembolso(Reserva r ,int fechaCancelacion) {
		if(fechaCancelacion > r.getFechaReserva()) {
			return r.montoAPagar();
		}
		return 0;
	}
}
