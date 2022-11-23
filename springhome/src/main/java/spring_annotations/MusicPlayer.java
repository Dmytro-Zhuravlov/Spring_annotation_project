package spring_annotations;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("musicPlayer")
public class MusicPlayer {
	private MusicCollection rockMusicCollection;
	private MusicCollection classicalMusicCollection;
	private MusicCollection popMusicCollection;

	@Autowired
	public MusicPlayer(
			RockMusicCollection rockMusicCollection, 
			ClassicMusicCollection classicalMusicCollection, 
			PopMusicCollection popMusicCollection) {
		this.rockMusicCollection = rockMusicCollection;
		this.classicalMusicCollection = classicalMusicCollection;
		this.popMusicCollection = popMusicCollection;
	}

	public void playMusic(KindsOfMusic kindsOfMusic) {
		int i = (int) (Math.random() * 2);
		
		if(kindsOfMusic == KindsOfMusic.CLASSIC) {
			System.out.println(classicalMusicCollection.getSong(i));
		} else if(kindsOfMusic == KindsOfMusic.POP) {
			System.out.println(popMusicCollection.getSong(i));
		} else {
			System.out.println(rockMusicCollection.getSong(i));
		}
	}
}