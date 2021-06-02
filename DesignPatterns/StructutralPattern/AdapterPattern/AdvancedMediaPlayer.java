package AdapterDesignPattern;

public interface AdvancedMediaPlayer {
	
	void loadFilename(String filename);
	
	void listen();

}

class VlcPlayer implements  AdvancedMediaPlayer {
	private String filename;
	@Override
	public void loadFilename(String filename) {
		this.filename = filename;
		
	}

	@Override
	public void listen() {
		
		System.out.println("Playing vlc file. Name: "+filename);
	}


	
}

class Mp4Player implements  AdvancedMediaPlayer {

	private String filename;
	@Override
	public void loadFilename(String filename) {
		this.filename = filename;
		
	}

	@Override
	public void listen() {
		System.out.println("Playing mp4 file. Name: "+filename);
	}
	
}
