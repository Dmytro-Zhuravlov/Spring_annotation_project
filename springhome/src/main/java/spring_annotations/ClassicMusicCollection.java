package spring_annotations;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusicCollection implements MusicCollection{
	private ClassicalMusic[] classicMusicList = {new ClassicalMusic(), new ClassicalMusic(), new ClassicalMusic()};

	public ClassicMusicCollection() {
		classicMusicList[0].setNameOfMusic("Music 1");
		classicMusicList[1].setNameOfMusic("Music 2");
		classicMusicList[2].setNameOfMusic("Music 3");
	}
	
	@Override
	public Music getSong(int index) {
		return classicMusicList[index];
	}

	
}
