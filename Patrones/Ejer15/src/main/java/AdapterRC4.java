
public class AdapterRC4 {
	private RC4 r = new RC4();
	private String key;
	
	public AdapterRC4(String key) {
		this.key=key;
	}
	
	public String escriptar(String mensaje) {
		return this.r.encriptar(mensaje, key);
	}
	
	public String desencriptar(String mensaje) {
		return this.r.desencriptar(mensaje, key);
	}
}
