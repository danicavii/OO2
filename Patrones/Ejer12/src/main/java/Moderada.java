
public class Moderada {
	public  double calcularReembolso(Reserva r,int fechaCancelacion) {
		double monto=0;
		if( r.getFechaReserva()-fechaCancelacion > 7) {
			monto= r.montoAPagar();
		}else {
			if(r.getFechaReserva()-fechaCancelacion > 2) {
				monto= r.montoAPagar()/2;
			}
		}
		return monto;
	}
}
