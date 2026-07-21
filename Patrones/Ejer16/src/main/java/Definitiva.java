
public class Definitiva implements State{

	public String informacion(Excursion e) {
		String aux = "";
		aux += "Nombre excursión: " + e.getNombre() + "\n";
		aux += "Costo: " + e.getCosto() + "\n";
		aux += "Fechas: " + e.getFechaInicio() + " y " + e.getFechaFin() + "\n";
		aux += "Punto de encuentro: " + e.getPuntoEncuentro() + "\n";
		aux += "Mails de usuarios: \n" ;
		for (Usuario u: e.getUsuarios()) {
			aux+= u.getMail() +  "\n" ;
		}
		aux += "Usuarios faltantes: " + e.usuariosFaltanteMaximo() + "\n";
		return aux;
	}
	
	public void inscribirUsuario(Excursion e, Usuario u) {
		if(e.getUsuarios().size() <= e.getCupoMaximo()) {
			e.getUsuarios().add(u);
		}else {
			e.setEstado(new ListaEspera());
		}
	}
}
