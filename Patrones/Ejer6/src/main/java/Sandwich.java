import java.util.ArrayList;
import java.util.List;
public class Sandwich {
	private List<Ingrediente> ingredientes= new ArrayList<>();
	
	public void addIngrediente(String nombre, int precio) {
		ingredientes.add(new Ingrediente(nombre,precio));
	}
	
	public void precioTotal() {
		System.out.println("Los ingredientes del sandwich son: ");
		int total=0;
		for (Ingrediente i: ingredientes) {
			total+= i.getPrecio();
			System.out.println("- "+ i.getNombre()+" ($ "+ i.getPrecio()+" ) ");
		}
		System.out.println(
				"Precio Total: "+ total);
	}
}
