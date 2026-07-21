import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	private Empleado empleadoTemp= new EmpleadoTemporario(500,2,true);
	private Empleado empleadoPasante= new EmpleadoPasante(4);
	private Empleado empleadoPlanta= new EmpleadoPlanta(false,1,0);
	
	
	@BeforeEach
    public void setUp() throws Exception {
        empleadoTemp = new EmpleadoTemporario(500,2,true); 
        empleadoPasante= new EmpleadoPasante(4);
    	empleadoPlanta= new EmpleadoPlanta(false,1,0);
    }

	
	public void testDescuento() {
	}
}
