
public class SilverFactory extends ProductoFactory {
	private double tasa= 0.05;
	private int plazoMinimo= 35;
	private int parking= 72;
	
	public Product crearProducto (int tipo) {
		switch(tipo) {
		case 1: return new ComprarDolares();
        case 2: return new ComprarPesos();
        case 3: return new PlazoFijo(plazoMinimo, tasa);
        case 4: return new BonoBajoRiesgo(parking);
        case 5: return new BonoAltoRiesgo(parking);
        case 6: // Paquete 1
        	return super.crearPaquete(
        			new ComprarDolares(),
            		new PlazoFijo(plazoMinimo, tasa),
            		new ComprarPesos());
        case 7: // Paquete 2
            return super.crearPaquete(
            		new BonoBajoRiesgo(parking),
            		new ComprarDolares(),
            		new PlazoFijo(plazoMinimo, tasa),
            		new ComprarPesos());
        default: throw new IllegalArgumentException("Tipo no válido para Silver");
        }
	}
}
