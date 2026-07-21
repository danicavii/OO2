
public class Clasico implements BuilderSandwich {
	private Sandwich sandwichClasico = new Sandwich();
	
	public void addPan() {
		this.sandwichClasico.addIngrediente("Pan Brioche", 100);
	}
	public void addAderezo() {
		this.sandwichClasico.addIngrediente("Mayonesa", 20);
	}
	public  void addPrincipal() {
		this.sandwichClasico.addIngrediente("Carne de Ternera", 300);
	}
	
	public  void addAdicional() {
		this.sandwichClasico.addIngrediente("Tomate", 80);
	}
	public Sandwich getSandwich() {
		return this.sandwichClasico;
	}
}
