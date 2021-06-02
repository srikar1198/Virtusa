package AdapterDesignPattern;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {
	AdvancedMediaPlayer adavancedMediaPlayer;
	
	
	
	public AdvancedMediaPlayerAdapter(String audioType,String filename) {
		if(audioType.equalsIgnoreCase("vlc"))
			adavancedMediaPlayer=new VlcPlayer();
		else if(audioType.equalsIgnoreCase("mp4"))
			adavancedMediaPlayer=new Mp4Player();
		   adavancedMediaPlayer.loadFilename(filename);
	}
	
	@Override
	public void play(String audioType, String filename) {
	
		if(audioType.equalsIgnoreCase("vlc"))
			adavancedMediaPlayer.listen();
		else if(audioType.equalsIgnoreCase("mp4"))
			adavancedMediaPlayer.listen();
	}

}
