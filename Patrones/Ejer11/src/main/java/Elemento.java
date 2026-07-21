import java.time.LocalDate;
import java.util.List;

public abstract class Elemento {
	private String nombre;
	private int fechaCreacion;
	
	public Elemento(String nombre, int fecha) {
		this.nombre=nombre;
		this.fechaCreacion= fecha;
	}
	
	public abstract int getTamanio();
	
	public abstract Archivo getMasGrande();
	
	public abstract Archivo getMasNuevo();
	
	public int getFechaCreacion() {
		return this.fechaCreacion;
	}
	
	public abstract Elemento getBuscar(String unNombre);
	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract List<Elemento> getbuscarTodos (String nombre);
	public abstract String listadoDeContenido(String pathBase);
}
