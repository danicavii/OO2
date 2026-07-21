
public class MainSandwich {

	public static void main(String[] args) {
		BuilderSandwich builder = new Clasico(); // El builder tiene todos los pasos para armar un sandwich, pero se especifica que tipo
		Director director = new Director(builder);// el que ordena los pasos 
		Sandwich sandwichClasico= director.construirSandwich(); // El producto final 
		sandwichClasico.precioTotal();
		
		BuilderSandwich builder2= new Vegetariano();
		director.setBuilder(builder2);
		Sandwich sandwichVegetariano= director.construirSandwich();
		sandwichVegetariano.precioTotal();
		
		BuilderSandwich builder3= new Vegano();
		director.setBuilder(builder3);
		Sandwich sandwichVegano= director.construirSandwich();
		sandwichVegano.precioTotal();
		
		BuilderSandwich builder4= new SinTacc();
		director.setBuilder(builder4);
		Sandwich sandwichSinTacc= director.construirSandwich();
		sandwichSinTacc.precioTotal();
		
	}

}
