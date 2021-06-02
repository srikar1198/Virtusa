package AdapterDesignPattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		MediaPlayer mediaPlayer=new AudioPlayer();
		mediaPlayer.play("mp3","Blinding Lights");
		mediaPlayer.play("mp4","Unforgettable");
		mediaPlayer.play("vlc","Another one bites the dust");
		mediaPlayer.play("avi", "The plan");
	         

	}

}
