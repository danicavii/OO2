
public class AdapterFeistelCipher {
	private FeistelCipher f;
	public AdapterFeistelCipher(String key) {
		f= new FeistelCipher(key);
	}
	
	public String encriptar(String mensaje) {
		return this.f.encode(mensaje);
	}
	
	public String desencriptar(String mensaje) {
		return this.f.decode(mensaje);
	}
}
