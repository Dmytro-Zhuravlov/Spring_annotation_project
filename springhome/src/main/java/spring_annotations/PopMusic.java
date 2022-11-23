package spring_annotations;

public class PopMusic implements Music{

	private String nameOfMusic;
		
	@Override
	public String getSong() {
		return "Playing LADY GAGA";
	}

	public String getNameOfMusic() {
		return nameOfMusic;
	}

	public void setNameOfMusic(String nameOfMusic) {
		this.nameOfMusic = nameOfMusic;
	}

	@Override
	public String toString() {
		return "PopMusic [nameOfMusic=" + nameOfMusic + "]";
	}
}
