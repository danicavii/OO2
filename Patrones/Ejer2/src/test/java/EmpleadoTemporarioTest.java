import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


public class EmpleadoTemporarioTest {
	private Empleado empCasadoSinHijos;
	private Empleado empCasadoConHijos;
	private Empleado empSolteroSinHijos;
	private Empleado empSolteroConHijos;
	
	@BeforeEach
	public void setUp() throws Exception {
		empCasadoSinHijos = new EmpleadoTemporario(1, 0, true);
		empCasadoConHijos = new EmpleadoTemporario(1, 1, true);
		empSolteroSinHijos = new EmpleadoTemporario(1, 0, false);
		empSolteroConHijos = new EmpleadoTemporario(1, 1, false);
	}

	@Test
	public void testSueldoBasico() {
		assertEquals(20300, empCasadoSinHijos.SueldoBasico());
		assertEquals(20300, empCasadoConHijos.SueldoBasico());
		assertEquals(20300, empSolteroSinHijos.SueldoBasico());
		assertEquals(20300, empSolteroConHijos.SueldoBasico());
	}
	@Test
	public void testCalcularAdicionales() {
		assertEquals(5000, empCasadoSinHijos.Adicional());
		assertEquals(7000, empCasadoConHijos.Adicional());
		assertEquals(0, empSolteroSinHijos.Adicional());
		assertEquals(2000, empSolteroConHijos.Adicional());
	}
	
	@Test
	public void testCalcularDescuentos() {
	    assertEquals(2889, empCasadoSinHijos.descuento());
	    assertEquals(2989, empCasadoConHijos.descuento());
	    assertEquals(2639, empSolteroSinHijos.descuento());
	    assertEquals(2739, empSolteroConHijos.descuento());
	}

	@Test
	public void sueldo() {
	    assertEquals(22411, empCasadoSinHijos.sueldo());
	    assertEquals(24311, empCasadoConHijos.sueldo());
	    assertEquals(17661, empSolteroSinHijos.sueldo());
	    assertEquals(19561, empSolteroConHijos.sueldo());
	}
}
