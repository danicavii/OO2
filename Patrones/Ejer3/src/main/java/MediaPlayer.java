import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	private List<Media> lista = new ArrayList();
	
	
	public void addMedia(Media m) {
		this.lista.add(m);
	}
	
	public void play() {
		for(Media m: lista) {
			m.play();
		}
	}
}
