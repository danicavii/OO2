
public class Vegano implements BuilderSandwich{
	private Sandwich SandwichVegano= new Sandwich();
	public void addPan() {
		this.SandwichVegano.addIngrediente("Pan Integra", 100);
	}
	public void addAderezo() {
		this.SandwichVegano.addIngrediente("Salsa Criolla", 20);
	}
	public  void addPrincipal() {
		this.SandwichVegano.addIngrediente("Milanesa de girgolas", 500);
	}
	
	public  void addAdicional() {
		this.SandwichVegano.addIngrediente("Sin Adicional", 0);
	}
	public Sandwich getSandwich() {
		return this.SandwichVegano;
	}
}
