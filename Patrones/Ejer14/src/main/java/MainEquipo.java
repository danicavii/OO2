
public class MainEquipo {

	public static void main(String[] args) {
		Builder builder1= new BasicoBuilder();
		ArmadorEquipo director = new ArmadorEquipo(builder1);
		
		Equipo equipoBasico= director.armarEquipo();
		equipoBasico.calcularConsumo();
		equipoBasico.calcularPrecio();
		
		Builder builder2= new IntermedioBuilder();
		director.setBuilder(builder2);
		Equipo equipoIntermedio = director.armarEquipo();
		equipoIntermedio.calcularConsumo();
		equipoIntermedio.calcularPrecio();
		
		Builder builder3= new GamerBuilder();
		director.setBuilder(builder3);
		Equipo equipoGamer = director.armarEquipo();
		equipoGamer.calcularConsumo();
		equipoGamer.calcularPrecio();
	}

}
