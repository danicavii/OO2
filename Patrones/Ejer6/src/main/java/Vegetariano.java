
public class Vegetariano implements BuilderSandwich{
	private Sandwich SandwichVegetariano= new Sandwich();
	public void addPan() {
		this.SandwichVegetariano.addIngrediente("Pan con semillas", 120);
	}
	public void addAderezo() {
		this.SandwichVegetariano.addIngrediente("Sin aderezo", 0);
	}
	public  void addPrincipal() {
		this.SandwichVegetariano.addIngrediente("Provoleta grillada", 200);
	}
	
	public  void addAdicional() {
		this.SandwichVegetariano.addIngrediente("Berenjenas al escabeche", 100);
	}
	public Sandwich getSandwich() {
		return this.SandwichVegetariano;
	}
}
