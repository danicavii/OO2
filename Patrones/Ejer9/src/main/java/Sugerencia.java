import java.util.List;
public interface Sugerencia {
	
	public abstract List<Pelicula> sugerir(List<Pelicula> grillaPelis,List<Pelicula> pelisReproducidas);
}
