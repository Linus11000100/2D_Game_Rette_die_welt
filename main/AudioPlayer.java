package game.main;

import java.util.HashMap;
import java.util.Map;

import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;

public class AudioPlayer {

	
	public static Map <String,Sound> soundMap = new HashMap<String,Sound>();
	public static Map <String, Music> musicMap = new HashMap<String, Music>();
	
	public static void load() {
		
		try {
			soundMap.put("klick_sound", new Sound("res/click_sound.ogg"));
			
			musicMap.put("menu", new Music("res/menu.ogg"));
			
			musicMap.put("boss_normal", new Music("res/boss_fight.ogg"));
			musicMap.put("play_normal", new Music("res/background_music.ogg"));
			musicMap.put("boss_hard", new Music("res/menu.ogg"));
			musicMap.put("play_hard", new Music("res/menu.ogg"));
			
			musicMap.put("music", new Music("res/background_music.ogg"));
			
			
		} catch (SlickException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static Music getMusic(String key) {
		return musicMap.get(key);
	}
	public static Sound getSound(String key) {
		return soundMap.get(key);
	}
	
}
