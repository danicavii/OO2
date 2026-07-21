
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TestExcursion {

	@Test
	public void TestInscribirUsuario() {
		Excursion kayak = new Excursion(
		        "Dos días en kayak bajando el Paraná",
		        LocalDate.of(2026,6,1),
		        LocalDate.of(2026,6,2),
		        "Puerto Rosario",
		        2,   // cupo máximo
		        1,   // cupo mínimo
		        10000 // costo
		    );

		    Usuario u1 = new Usuario("Ana", "Lopez", "ana@mail.com");
		    Usuario u2 = new Usuario("Luis", "Perez", "luis@mail.com");
		    kayak.inscribirUsuario(u1);
		    kayak.inscribirUsuario(u2);

		    // Verifico que los dos primeros entraron
		    assertEquals(2, kayak.getUsuarios().size());

		    // El tercero debería ir a lista de espera
		    Usuario u3 = new Usuario("Carlos", "Diaz", "carlos@mail.com");
		    kayak.inscribirUsuario(u3);
		    assertEquals(1, kayak.getListaEspera().size());


	}
}
