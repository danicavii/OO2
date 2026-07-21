
public class GoldFactory extends ProductoFactory {
	private double tasa=0.06;
	private int plazoMinimo= 30;
	private int parking= 24;
	
	public Product crearProducto(int tipo) {
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
     
        case 8:
        	return super.crearPaquete(
        			new BonoAltoRiesgo(parking),
        			new BonoBajoRiesgo(parking),
        			new PlazoFijo(plazoMinimo, tasa)); 
        case 9:
            return super.crearPaquete(
                    new BonoAltoRiesgo(parking),
                    new BonoAltoRiesgo(parking),
                    new BonoAltoRiesgo(parking));
       
        default: throw new IllegalArgumentException("Tipo no válido para Silver");
        }

	}
}
