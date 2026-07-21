import java.util.List;
import java.util.ArrayList;
public class Equipo {
	private List<Componente> componentes=new ArrayList();
	
	public void addComponente(Componente c) {
		this.componentes.add(c);
	}
	
	public  double calcularConsumo() {
		return componentes.stream().mapToDouble(Componente::getConsumo).sum();
    }
	
	public double calcularPrecio() {
		double subtotal = componentes.stream().mapToDouble(Componente::getPrecio).sum();
        return subtotal * 1.21; // IVA 21%

	}
}	
