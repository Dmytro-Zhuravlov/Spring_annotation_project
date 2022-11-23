package spring_annotations;

import org.springframework.stereotype.Component;

@Component
public class PopMusicCollection implements MusicCollection{
	private PopMusic[] popMusicList = {new PopMusic(), new PopMusic(), new PopMusic()};

	public PopMusicCollection() {
		popMusicList[0].setNameOfMusic("Music 1");
		popMusicList[1].setNameOfMusic("Music 2");
		popMusicList[2].setNameOfMusic("Music 3");
	}
	@Override
	public Music getSong(int index) {
		return popMusicList[index];
	}
}
