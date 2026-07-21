import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;



public class  testEjer9 {
	
	public Decodificador crearDecodificador() {
		 Pelicula thor = new Pelicula("Thor", 2007, 7.9);
		 Pelicula capitan = new Pelicula("Capitan America", 2016, 7.8);
		 Pelicula iron = new Pelicula("Iron Man", 2010, 7.9);
		 Pelicula dunkirk = new Pelicula("Dunkirk", 2017, 7.9);
		 Pelicula rocky = new Pelicula("Rocky", 1976, 8.1);
		 Pelicula rambo = new Pelicula("Rambo", 1979, 7.8);
	
		 // Relaciones
		 thor.agregarSimilar(capitan);
		 thor.agregarSimilar(iron);
		 capitan.agregarSimilar(iron);
		 rocky.agregarSimilar(rambo);
		 //agrego todas las peli
		 List<Pelicula> grilla= Arrays.asList(thor,capitan,iron,dunkirk,rocky,rambo);
		 
		 Decodificador deco1 = new Decodificador(grilla);
		 deco1.Reproducir(thor);
		 deco1.Reproducir(rocky);
		 return deco1;
	}
		 
	@Test
	public void testSugerenciaPorNovedad() {
		Decodificador deco = crearDecodificador();
		 deco.cambiarSugerencia(new Novedad());
		 List<Pelicula> pelisNovedad = deco.sugerirPeliculas();
		 assertTrue(pelisNovedad.containsAll(Arrays.asList(new Pelicula("Dunkirk", 2017, 7.9),
		            new Pelicula("Capitan America", 2016, 7.8),
		            new Pelicula("Iron Man", 2010, 7.9))));
	}
	
	@Test 
	public void testSugerenciasPorPuntaje() {
		Decodificador deco = crearDecodificador();
		deco.cambiarSugerencia(new Puntaje());
		 List<Pelicula> pelisPuntaje = deco.sugerirPeliculas();
		 assertTrue(pelisPuntaje.containsAll(Arrays.asList(new Pelicula("Dunkirk", 2017, 7.9),
		            new Pelicula("Iron Man", 2010, 7.9),
		            new Pelicula("Capitan America", 2016, 7.8))));
	}
		
		
	@Test 
	public void testSugerenciasPorSimiaridad() {
		Decodificador deco = crearDecodificador();
		 deco.cambiarSugerencia(new Similiaridad()); 
		 List<Pelicula> pelisSimilaridad = deco.sugerirPeliculas(); 
		 assertTrue(pelisSimilaridad.containsAll(Arrays.asList(new Pelicula("Capitan America", 2016, 7.8),
		            new Pelicula("Iron Man", 2010, 7.9),
		            new Pelicula("Rambo", 1979, 7.8))));

	}




}
