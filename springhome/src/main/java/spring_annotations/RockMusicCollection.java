package spring_annotations;

import org.springframework.stereotype.Component;

@Component
public class RockMusicCollection implements MusicCollection{

	private RockMusic[] rockMusicList = {new RockMusic(), new RockMusic(), new RockMusic()};

	public RockMusicCollection() {
		rockMusicList[0].setNameOfMusic("Music 1");
		rockMusicList[1].setNameOfMusic("Music 2");
		rockMusicList[2].setNameOfMusic("Music 3");
	}
	@Override
	public Music getSong(int index) {
		return rockMusicList[index];
	}
}
