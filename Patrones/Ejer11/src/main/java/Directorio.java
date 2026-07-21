import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Directorio extends Elemento {
	private List<Elemento> listaElementos= new ArrayList();
	private int tamañoDic= 32;
	
	public Directorio (String nombre, int fecha) {
		super(nombre,fecha);
	}
	
	public void añadirElemento(Elemento e) {
		this.listaElementos.add(e);
	}
	
	public int getTamanio() {
		int suma =this.tamañoDic;
		for(Elemento e: listaElementos) {
			suma+= e.getTamanio();
		}
		return suma;
	}
	public Archivo getMasGrande() {
		Archivo maxArchivo=null;Archivo unArchivo=null;
		for(Elemento e: listaElementos) {
			unArchivo=e.getMasGrande();
			if(unArchivo != null) {
				if(maxArchivo ==null || unArchivo.getTamanio()> maxArchivo.getTamanio()) {
					maxArchivo= unArchivo;
				}
			}
		}
		return maxArchivo;
	}
	
	public Archivo getMasNuevo() {
		Archivo maxArchivo=null;Archivo unArchivo=null;
		for(Elemento e: listaElementos) {
			unArchivo=e.getMasNuevo();
			if(unArchivo != null) {
				if(maxArchivo ==null || unArchivo.getFechaCreacion()> maxArchivo.getFechaCreacion()) {
					maxArchivo= unArchivo;
				}
			}
		}
		return maxArchivo;
	}
	public Elemento getBuscar(String nombre) {
	    if (this.getNombre().equals(nombre)) {// si el nombre de directorio es igual
	        return this;
	    }
	    for (Elemento e : listaElementos) {
	        Elemento encontrado = e.getBuscar(nombre);
	        if (encontrado != null) {
	            return encontrado;
	        }
	    }
	    return null;
	}
	public List<Elemento> getbuscarTodos (String nombre){
		List<Elemento> lista= new ArrayList<>();
		if(this.getNombre().equals(nombre)) {
			lista.add(this);
		}
		for(Elemento e: this.listaElementos) {
			lista.addAll(e.getbuscarTodos(nombre));
		}
		return lista;
	}
	@Override
	public String listadoDeContenido(String pathBase) {
	    StringBuilder sb = new StringBuilder();
	    String currentPath = pathBase + "/" + this.getNombre();
	    sb.append(currentPath).append("\n");

	    for (Elemento e : listaElementos) {
	        sb.append(e.listadoDeContenido(currentPath));
	    }
	    return sb.toString();
	}
}
