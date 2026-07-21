import java.util.List;

public class Union implements ElementoQuimico {
	private List<ElementoQuimico> componentes;
	
	public void agregarComponente(ElementoQuimico componente) {
		this.componentes.add(componente);
	}
	
	public String Formula() {
		String form ="";
		for(ElementoQuimico e: this.componentes) {
			form+= e.Formula();
		}
		return form;
	}

	public int PesoMolecular() {
		int suma=0;
		for(ElementoQuimico e: this.componentes) {
			suma+= e.PesoMolecular();
		}
		return suma;
	}
	
	public int Carga() {
		int suma=0;
		for(ElementoQuimico e: this.componentes) {
			suma+= e.Carga();
		}
		return suma;
	}
	
	public boolean EsValida() {
		int cantidadMetales=0;
		int cantidadNoMetales=0;
		for(ElementoQuimico e: this.componentes) {
			if (e instanceof Atomo) {
				Atomo a = (Atomo) e;
	            if (a.getClasificacion()) {
	                cantidadMetales++;
	            } else {
	                cantidadNoMetales++;
	            }
	        }
	    }
		if (cantidadMetales > 1 && cantidadNoMetales == 0) {
	        return false;
	    }
	    return true;
	}
	

}
