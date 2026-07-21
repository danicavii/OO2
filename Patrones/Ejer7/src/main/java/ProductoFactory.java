
public abstract class ProductoFactory {
	
	public abstract Product crearProducto(int Tipo);
	
	protected Product crearPaquete(Product... productos) {
	    PaqueteFinanciero paquete = new PaqueteFinanciero();

	    for (Product p : productos) {
	        paquete.agregarProducto(p);
	    }

	    return paquete;
	}
}
