
public class Director {
	private BuilderSandwich builder;
	
	public Director( BuilderSandwich unbuilder) {
		this.builder= unbuilder;
	}
	
	public Sandwich construirSandwich() {
		this.builder.addPan();
		this.builder.addAderezo();
		this.builder.addPrincipal();
		this.builder.addAdicional();
		return this.builder.getSandwich();
	}
	
	public void setBuilder(BuilderSandwich unbuilder) {
		this.builder= unbuilder;
	}
}
