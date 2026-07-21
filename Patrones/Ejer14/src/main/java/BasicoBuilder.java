
public class BasicoBuilder implements Builder{
	private Equipo equipoBasico= new Equipo();
	private Catalogo catalogo = new Catalogo();
	
	public  void addProcesador() {
		equipoBasico.addComponente(catalogo.getComponente("Procesador Basico"));
	}
	public  void addMemoria() {
		equipoBasico.addComponente(catalogo.getComponente("Memoria RAM 8 GB"));
	}
	public  void addDisco() {
		equipoBasico.addComponente(catalogo.getComponente("Disco HDD 500 GB"));
	}
	public  void addTarjetaGrafica() {
		equipoBasico.addComponente(catalogo.getComponente("No posee"));
	}
	public  void addGabinete() {
		equipoBasico.addComponente(catalogo.getComponente("Gabinete Estándar"));
	}
	public  Equipo getEquipo() {
		return equipoBasico;
	}
}
