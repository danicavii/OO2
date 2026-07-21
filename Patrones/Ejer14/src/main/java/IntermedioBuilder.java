
public class IntermedioBuilder implements Builder {
	private Equipo equipoIntermedio= new Equipo();
	private Catalogo catalogo = new Catalogo();
	
	public  void addProcesador() {
		equipoIntermedio.addComponente(catalogo.getComponente("Procesador Intermedio"));
	}
	public  void addMemoria() {
		equipoIntermedio.addComponente(catalogo.getComponente("Memoria RAM 16 GB"));
	}
	public  void addDisco() {
		equipoIntermedio.addComponente(catalogo.getComponente("Disco SSD 500 GB"));
	}
	public  void addTarjetaGrafica() {
		equipoIntermedio.addComponente(catalogo.getComponente("Tarjeta GTX 1650"));
	}
	public  void addGabinete() {
		equipoIntermedio.addComponente(catalogo.getComponente("Gabinete Intermedio"));
	}
	public  Equipo getEquipo() {
		return equipoIntermedio;
	}
}
