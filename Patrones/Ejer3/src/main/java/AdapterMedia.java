
public class AdapterMedia implements Media {
	private VideoStream stream ;
	
	public AdapterMedia(VideoStream v) {
		this.stream= v;
	}
	
	public void play() {
		this.stream.reproducir();
	}
}
