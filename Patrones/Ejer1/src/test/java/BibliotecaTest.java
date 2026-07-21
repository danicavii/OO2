
import static org.junit.Assert.*;
import org.junit.Test;
public class BibliotecaTest {
	 
	@Test
	 public void testExportarSocios() {
		 Biblioteca biblioteca = new Biblioteca();
		 
		 biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		 biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2"));

		 String resultado = biblioteca.exportarSocios();
		 
		 assertTrue(resultado.contains("Arya Stark"));
		 assertTrue(resultado.contains("needle@stark.com"));
		 assertTrue(resultado.contains("2345-2"));
		 
		 assertTrue(resultado.startsWith("["));
		 assertTrue(resultado.endsWith("]"));
		 assertTrue(resultado.contains("{"));
		 assertTrue(resultado.contains("}"));
	 }

}
