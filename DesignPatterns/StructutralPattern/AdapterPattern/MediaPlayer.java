package AdapterDesignPattern;

public interface MediaPlayer {
	
	void play(String audioType,String filename);

}

class AudioPlayer implements  MediaPlayer{
	AdvancedMediaPlayerAdapter advanceMedia;
	
	public void play(String audioType, String filename) {
		
		if(audioType.equalsIgnoreCase("mp3"))
			System.out.println("Playing "+audioType+", Name: "+ filename);
		else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			advanceMedia = new AdvancedMediaPlayerAdapter(audioType,filename);
			advanceMedia.play(audioType, filename);
		}
		else {
			System.out.println("Invalid media ."+audioType+" format not supported");
		}
	}
	
}
