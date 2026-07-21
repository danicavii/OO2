import java.util.List;

public class FileSystem {
	private List<Elemento> listaElementos= new ArrayList();
		
	public int tamanioTotalOcupado() {
		int sumaTotal=0;
		for(Elemento e: listaElementos) {
			sumaTotal+= e.getTamanio();
		}
		return sumaTotal;
	}
	
	public Archivo archivoMasGrande() {
		Archivo maxArchivo=null;Archivo unArchivo=null;
		for(Elemento e: listaElementos) {
			unArchivo=e.getMasGrande();
			if(unArchivo !=null) {
				if(maxArchivo ==null|| unArchivo.getTamanio()> maxArchivo.getTamanio()) {
					maxArchivo= unArchivo;
				}
			}
		}
		return maxArchivo;
	}
	
	public Archivo ArchivomasNuevo() {
		Archivo maxArchivo=null;Archivo unArchivo=null;
		for(Elemento e: listaElementos) {
			unArchivo=e.getMasNuevo();
			if(unArchivo !=null) {
				if(maxArchivo ==null|| unArchivo.getFechaCreacion()> maxArchivo.getFechaCreacion()) {
					maxArchivo= unArchivo;
				}
			}
		}
		return maxArchivo;
	}
	public Elemento buscar(String unNombre) {
	    for (Elemento e : listaElementos) {
	        Elemento encontrado = e.getBuscar(nombre);
	        if (encontrado != null) {
	            return encontrado;
	        }
	    }
	    return null;
	}
	public List<Elemento> buscarTodos(String nombre){
		List<Elemento> listaTodos = new ArrayList<>();
		for(Elemento e: this.listaElementos) {
			listaTodos.addAll(e.getbuscarTodos(nombre));
		}
		return listaTodos;
	}
	
	public String listadoDeContenido() {
	    StringBuilder sb = new StringBuilder();
	    for (Elemento e : listaElementos) {
	        sb.append(e.listadoDeContenido(""));
	    }
	    return sb.toString();
	}

}
