import java.util.ArrayList;
import java.util.List;

public class Mixta implements Elementoo{
	private List<Elementoo> childrens = new ArrayList();
	
	public void addElemento(Elementoo e) {
		this.childrens.add(e);
	}
	
	public void removeElemento(Elementoo e) {
		this.childrens.remove(e);
	}
	
	public double getProporcioAgua() {
		double total=0;
		for(Elementoo e: childrens) {
			total += e.getProporcioAgua();
		}
		return total/ this.childrens.size();
	}
	
	public double getProporcionTierra() {
		double total=0;
		for(Elementoo e: childrens) {
			total += e.getProporcionTierra();
		}
		return total/ this.childrens.size();
	}
	
}
