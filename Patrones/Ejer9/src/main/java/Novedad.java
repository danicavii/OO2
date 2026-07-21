import java.util.List;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Novedad implements Sugerencia {
	
	public List<Pelicula> sugerir (List<Pelicula> grillaPelis,List<Pelicula> reproducidas){
		return grillaPelis.stream()
	            .filter(p -> !reproducidas.contains(p))//filtra la peliculas que no reprodujo 
	            .sorted(Comparator.comparing(Pelicula::getAnioEstreno).reversed())// compara las pelis por año, reserved invierte el orden par que el mas nuevo quede primero
	            .limit(3)
	            .collect(Collectors.toList());
		
	}
}
