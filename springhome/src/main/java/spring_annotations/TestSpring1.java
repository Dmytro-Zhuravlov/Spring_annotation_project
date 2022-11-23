package spring_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring1 {
	public static void main(String[] args) {
		// create application context with beans
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextHome.xml");	
				
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.playMusic(KindsOfMusic.ROCK);
		musicPlayer.playMusic(KindsOfMusic.CLASSIC);		
		musicPlayer.playMusic(KindsOfMusic.POP);		

		
		context.close();
	}
}
