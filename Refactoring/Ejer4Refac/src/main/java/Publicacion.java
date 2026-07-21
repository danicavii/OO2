
public class Publicacion {
	private String texto;
	private int likes;
	
	public Publicacion(String texto) {
		this.texto =texto;
		this.likes =0;
	}
	
	public void darLike() {
		this.likes++;
	}
	public void darDislike() {
		this.likes--;
	}
	private int impacto() {
		return likes*3;
	}
	public int alcance () {
		return impacto() * 10;
	}
}

/*Rename method: procesar (referenciado en línea 11 de Publicacion.java) por impacto
 * se debe cambiar en el metodo calcular el nombre modificado
Rename method: calcular (referenciado en línea 14 de Publicacion.java) por alcance
	el se cambia el metodo por alcance y tambien en la clase perfil en alcancedepublicaciones
*/

