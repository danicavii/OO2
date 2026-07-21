import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje implements Sugerencia {

	public List<Pelicula> sugerir (List<Pelicula> grillaPelis,List<Pelicula> reproducidas){
		return grillaPelis.stream()
	           .filter(p-> !reproducidas.contains(p))
	           .sorted(Comparator.comparing(Pelicula::getPuntaje).reversed()
	        		   .thenComparing(Pelicula::getAnioEstreno).reversed())
	           .limit(3)
	           .collect(Collectors.toList());
		
	}
}
