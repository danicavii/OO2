
public class MainTopografia {

	public static void main(String[] args) {
		        Agua agua = new Agua();
		        Tierra tierra = new Tierra();
		        Pantano pantano= new Pantano();

		        Mixta mixta = new Mixta();
		        mixta.addElemento(agua);
		        mixta.addElemento(tierra);
		        mixta.addElemento(tierra);
		        mixta.addElemento(agua);
		        mixta.addElemento(pantano);

		        System.out.println("Proporción de agua: " + mixta.getProporcioAgua());
		        System.out.println("Proporción de tierra: " + mixta.getProporcionTierra());
	}

}
