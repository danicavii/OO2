
public class Atomo implements ElementoQuimico{
	private String nombre;
	private String simbolo;
	private int pesoAtomico;
	private int carga;
	private boolean clasificacion;// metal o no metal;
	
	public Atomo(String nombre, String simbolo, int pesoAtomico, int carga, boolean clasificacion) {
		this.nombre= nombre;
		this.simbolo= simbolo;
		this.pesoAtomico= pesoAtomico;
		this.carga= carga;
		this.clasificacion=clasificacion;
	}
	
	
	public String Formula() {
		return this.simbolo;
	}
	
	public int PesoMolecular() {
		return this.pesoAtomico;
	}
	
	public int Carga() {
		return this.carga;
	}
	
	public boolean EsValida() {
		return true;
	}
	public boolean getClasificacion() {
		return this.clasificacion;
	}
}
