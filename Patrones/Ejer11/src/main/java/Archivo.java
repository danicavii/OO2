import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Archivo extends Elemento  {
	private int tamaño;
	
	public Archivo(String nombre,int fecha, int tamaño) {
		super(nombre,fecha);
		this.tamaño=tamaño;
	}
	
	public int getTamanio() {
		return this.tamaño;
	}
	
	public Archivo getMasGrande() {
		return this;
	}
	
	public Archivo getMasNuevo() {
		return this;
	}
	public Elemento getBuscar(String nombre) {
		if(this.getNombre().equals(nombre)) {
			return this;
		}
		return null;
	}
	public List<Elemento> getbuscarTodos (String nombre){
		List<Elemento> lista= new ArrayList<>();
		if(this.getNombre().equals(nombre)) {
			lista.add(this);
			return lista;
		}
		return lista;
	}
	
	@Override
	public String listadoDeContenido(String pathBase) {
	    return pathBase + "/" + this.getNombre() + "\n";
	}
}
