import java.util.ArrayList;
import java.util.List;

public class Catalogo {
	    private List<Componente> componentes = new ArrayList<>();

	    public Catalogo() {
	    	componentes.add( new Componente("Procesador Básico", 65, 100));
	        componentes.add( new Componente("Procesador Intermedio", 95, 200));
	        componentes.add( new Componente("Procesador Gamer", 125, 400));

	        componentes.add(new Componente("Memoria RAM 8 GB", 10, 50));
	        componentes.add(new Componente("Memoria RAM 16 GB", 15, 90));
	        componentes.add(new Componente("Memoria RAM 32 GB", 20, 150));

	        componentes.add( new Componente("Disco HDD 500 GB", 8, 60));
	        componentes.add(new Componente("Disco SSD 500 GB", 5, 100));
	        componentes.add(new Componente("Disco SSD 1 TB", 7, 180));

	        componentes.add( new Componente("Tarjeta GTX 1650", 75, 250));
	        componentes.add( new Componente("Tarjeta RTX 4090", 350, 2000));

	        componentes.add( new Componente("Gabinete Estándar", 5, 80));
	        componentes.add( new Componente("Gabinete Intermedio", 10, 120));
	        componentes.add( new Componente("Gabinete Gamer", 15, 200));

	        // Ejemplo de fuente dinámica: se puede agregar en runtime
	        componentes.add(new Componente("Fuente 800 W", 0, 100));

	        
	    }

	    public Componente getComponente(String descripcion) {
	        for (Componente c : componentes) {
	            if (c.getNombre().equalsIgnoreCase(descripcion)) {
	                return c;
	            }
	        }
	        return null; // si no se encuentra
	    }
	}
}
