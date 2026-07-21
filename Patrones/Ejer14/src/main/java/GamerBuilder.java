
public class GamerBuilder implements Builder{
	private Equipo equipoGamer= new Equipo();
	private Catalogo catalogo = new Catalogo();
	
	public  void addProcesador() {
		equipoGamer.addComponente(catalogo.getComponente("Procesador Gamer"));
	}
	public  void addMemoria() {
		equipoGamer.addComponente(catalogo.getComponente("Memoria RAM 32 GB"));
	}
	public  void addDisco() {
		equipoGamer.addComponente(catalogo.getComponente("Disco SSD 1 TB"));
	}
	public  void addTarjetaGrafica() {
		equipoGamer.addComponente(catalogo.getComponente("Tarjeta RTX 4090"));
	}
	public  void addGabinete() {
		equipoGamer.addComponente(catalogo.getComponente(("Gabinete Gamer"));
	}
	public  Equipo getEquipo() {
		return equipoGamer;
	}
}
