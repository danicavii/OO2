
public class Mensajero {
	private Algoritmo strategy;
	
	
	public void setStrategy(Algoritmo s) {
		this.strategy= s;
	}
	public String enviar(String mensaje) {
		return strategy.encriptar(mensaje);
	}

	
	public String recibir(String mensaje) {
		return strategy.desencriptar(mensaje);;
	}
}
