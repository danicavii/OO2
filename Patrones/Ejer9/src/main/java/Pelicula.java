import java.util.List;
import java.util.ArrayList;
public class Pelicula {
	private String titulo;
	private int anioEstreno;
	private double puntaje;
	private List<Pelicula> peliculaSimilar= new ArrayList<>();
	
	
	public Pelicula(String titulo, int Anio, double puntaje) {
		this.titulo=titulo;
		this.anioEstreno=Anio;
		this.puntaje= puntaje;
	}
	public void agregarSimilar(Pelicula peli) {
		if(!this.peliculaSimilar.contains(peli)) {
			this.peliculaSimilar.add(peli);
			peli.agregarSimilar(this);
		}
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public int getAnioEstreno() {
		return this.anioEstreno;
	}
	public double getPuntaje() {
		return this.puntaje;
	}
	
	public List<Pelicula> getPeliculasSimilares(){
		return this.peliculaSimilar;
	}
	
}
