package spring_annotations;

public class RockMusic implements Music{
	private String nameOfMusic;
	
	@Override
	public String getSong() {
		return "Now play Linking Park";
	}

	public String getNameOfMusic() {
		return nameOfMusic;
	}

	public void setNameOfMusic(String nameOfMusic) {
		this.nameOfMusic = nameOfMusic;
	}

	@Override
	public String toString() {
		return "RockMusic [nameOfMusic=" + nameOfMusic + "]";
	}
	
	
}
