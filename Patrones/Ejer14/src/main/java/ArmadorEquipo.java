
public class ArmadorEquipo {
	private Builder builder;
	
	public ArmadorEquipo(Builder builder) {
		this.builder=builder;
	}
	
	public void setBuilder(Builder nueBuilder) {
		this.builder=nueBuilder;
	}
	
	public Equipo armarEquipo() {// proceso importante para el orden de los pasos 
		this.builder.addProcesador();
		this.builder.addMemoria();
		this.builder.addDisco();
		this.builder.addTarjetaGrafica();
		this.builder.addGabinete();
		return builder.getEquipo();
	}
}
