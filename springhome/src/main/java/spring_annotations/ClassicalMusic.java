package spring_annotations;

public class ClassicalMusic implements Music{
	
	private String nameOfMusic;	
	
	
	@Override
	public String getSong() {
		return "Playing classic music";
	}

	public ClassicalMusic() {
		
	}

	public String getNameOfMusic() {
		return nameOfMusic;
	}

	public void setNameOfMusic(String nameOfMusic) {
		this.nameOfMusic = nameOfMusic;
	}

	@Override
	public String toString() {
		return "ClassicalMusic [nameOfMusic=" + nameOfMusic + "]";
	}	
}
