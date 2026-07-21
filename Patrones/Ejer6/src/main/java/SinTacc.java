
public class SinTacc implements BuilderSandwich{
	private Sandwich SandwichSinTacc= new Sandwich();
	public void addPan() {
		this.SandwichSinTacc.addIngrediente("Pan Chipa", 150);
	}
	public void addAderezo() {
		this.SandwichSinTacc.addIngrediente("Salsa Tartara", 18);
	}
	public  void addPrincipal() {
		this.SandwichSinTacc.addIngrediente("Carne de pollo", 250);
	}
	
	public  void addAdicional() {
		this.SandwichSinTacc.addIngrediente("Verduras grilladas", 200);
	}
	public Sandwich getSandwich() {
		return this.SandwichSinTacc;
	}
}
