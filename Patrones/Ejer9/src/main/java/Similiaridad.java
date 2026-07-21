import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Similiaridad  implements Sugerencia {

	public List<Pelicula> sugerir (List<Pelicula> grillaPelis,List<Pelicula> reproducidas){
		return grillaPelis.stream()
	           .flatMap(p-> p.getPeliculasSimilares().stream())
	           .filter(p-> !reproducidas.contains(p))
	           .distinct()
	           .sorted(Comparator.comparing(Pelicula::getAnioEstreno).reversed())
	           .limit(3)
	           .collect(Collectors.toList());
		
	}
}
