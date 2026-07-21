import java.util.List;
import java.util.ArrayList;
public class PaqueteFinanciero implements Product {
	private List<Product> productos= new ArrayList<>();
	
	public void agregarProducto(Product p) {
		this.productos.add(p);
	}
	public void eliminarProducto(Product p) {
		if(this.productos.contains(p)){
			this.productos.remove(p);
		}
	}
	
	public double Inversion(double montoInicial) {
		double total=0;
		for(Product p : this.productos) {
			total+= p.Inversion(montoInicial);
		}
		return total;
	}
}
