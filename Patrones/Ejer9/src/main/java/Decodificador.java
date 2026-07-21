import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	private Sugerencia tipoSugerencia;
	private List<Pelicula> grillaPeliculas = new ArrayList();
	private List<Pelicula> PeliculasReproducidas = new ArrayList();
	
	public Decodificador(List<Pelicula> grilla) {
		this.grillaPeliculas=grilla;
	}
	
	public List<Pelicula> sugerirPeliculas() {
		List<Pelicula> pelisSugeridas = new ArrayList();
		pelisSugeridas = tipoSugerencia.sugerir(grillaPeliculas, PeliculasReproducidas);
		return pelisSugeridas; 
	}
	
	public void cambiarSugerencia(Sugerencia s) {
		this.tipoSugerencia= s;
	}
	
	public void agregarSugerencia() {
		
	}
	
	public void Reproducir(Pelicula peli) {
		this.PeliculasReproducidas.add(peli);
	}
}
