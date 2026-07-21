
public class MainFinanciero {

	public static void main(String[] args) {
		ProductoFactory s= new SilverFactory();
		ProductoFactory g= new GoldFactory();
		
		Product p1= s.crearProducto(3); // Solo indica que producto crear 
		System.out.println(p1.Inversion(5000));
		
		Product pa1= s.crearProducto(7);//Indica que paquete(conjunto de productos) crear , sin necesidad de instanciar cada uno
		System.out.println(pa1.Inversion(2000));
		
		Product p2 = g.crearProducto(1);
		System.out.println(p2.Inversion(500));
		
		Product pa2= g.crearProducto(9);
		System.out.println(pa2.Inversion(2000));
		
	}

}
