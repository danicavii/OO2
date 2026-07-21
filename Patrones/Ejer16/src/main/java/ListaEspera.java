
public class ListaEspera implements State{

	public String informacion(Excursion e) {
		String aux = "";
		aux += "Nombre excursión: " + e.getNombre() + "\n";
		aux += "Costo: " + e.getCosto() + "\n";
		aux += "Fechas: " + e.getFechaInicio() + " y " + e.getFechaFin() + "\n";
		aux += "Punto de encuentro: " + e.getPuntoEncuentro() + "\n";
		return aux;
	}
	
	public void inscribirUsuario(Excursion e, Usuario u) {
		System.out.println("Añadiendo a lista de espera porque esta lleno");
		e.getListaEspera().add(u);
	}
}
