
public class MediaMain {

	public static void main(String[] args) {
		MediaPlayer mediaplayer1= new MediaPlayer();
		Media videoAdaptado = new AdapterMedia(new VideoStream());// se crea el objeto apartado

		mediaplayer1.addMedia(new Audio());
		mediaplayer1.addMedia(new VideoFile());
		mediaplayer1.addMedia(videoAdaptado);
		

	}

}
