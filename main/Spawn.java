package game.main;

import java.util.Random;

public class Spawn {

	private Handler handler;
	private HUD hud;
	private Game game;
	private Random r= new Random();
	
	private int scoreKeep = 0;
	
	public Spawn(Handler handler,HUD hud, Game game) {
		this.handler = handler;
		this.hud = hud;
		this.game = game;
	}
	
	
	public void tick() {
		scoreKeep++;
		
		if(scoreKeep >= 50) {
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1);
			
			//einstellung  der runden
			if(game.diff == 0) {
	
				if(hud.getLevel() == 1) {
					//AudioPlayer.getMusic("menu").stop();
					///handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					//AudioPlayer.getMusic("music").loop();
				}
				else if(hud.getLevel() == 2) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					AudioPlayer.getMusic("music").loop();
				}
				else if(hud.getLevel() == 3) { 
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 4) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));	
					
				}
				else if(hud.getLevel() == 5) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				else if(hud.getLevel() == 6) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				else if(hud.getLevel() == 7) {
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));	
				}
				else if(hud.getLevel() == 8) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));	
				}
				else if(hud.getLevel() == 9) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				else if(hud.getLevel() == 10) {
					handler.clearEnemys();
					AudioPlayer.getMusic("play_normal").stop();
					///AudioPlayer.getMusic("music").loop();
					AudioPlayer.getMusic("boss_normal").loop();
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));
					
				}else if(hud.getLevel() == 15) {
					handler.clearEnemys();
					AudioPlayer.getMusic("boss_normal").stop();
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					AudioPlayer.getMusic("play_normal").loop();
				}
				if(hud.getLevel() == 16) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					//AudioPlayer.getMusic("music").loop();
				}
				else if(hud.getLevel() == 17) { 
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 18) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));	
					
				}
				else if(hud.getLevel() == 19) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				else if(hud.getLevel() == 20) {
					handler.clearEnemys();
					///AudioPlayer.getMusic("music").loop();
					AudioPlayer.getMusic("boss_normal").loop();
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));
				}
				else if(hud.getLevel() == 25) {
				handler.clearEnemys();
				AudioPlayer.getMusic("boss_normal").stop();
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				AudioPlayer.getMusic("play_normal").loop();
				}
				else if(hud.getLevel() == 26) {
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 27) {
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));	
				}
				else if(hud.getLevel() == 28) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));	
				}
				else if(hud.getLevel() == 29) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				else if(hud.getLevel() == 30) {
				handler.clearEnemys();
				AudioPlayer.getMusic("boss_normal").stop();
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				AudioPlayer.getMusic("play_normal").loop();
				}
				else if(hud.getLevel() == 35) {
				handler.clearEnemys();
				AudioPlayer.getMusic("boss_normal").stop();
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				AudioPlayer.getMusic("play_normal").loop();
				}
				else if(hud.getLevel() == 36) {
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 37) {
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));	
				}
				else if(hud.getLevel() == 38) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 39) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				if(hud.getLevel() == 40) {
				handler.clearEnemys();
				AudioPlayer.getMusic("boss_normal").stop();
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				AudioPlayer.getMusic("play_normal").loop();
				}
				else if(hud.getLevel() == 45) {
				handler.clearEnemys();
				AudioPlayer.getMusic("boss_normal").stop();
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				AudioPlayer.getMusic("play_normal").loop();
				}
				else if(hud.getLevel() == 46) {
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 47) {
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));	
				}
				else if(hud.getLevel() == 48) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));	
				}
				else if(hud.getLevel() == 49) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				else if(hud.getLevel() == 50) {
				handler.clearEnemys();
				AudioPlayer.getMusic("boss_normal").stop();
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				AudioPlayer.getMusic("play_normal").loop();
				}
				else if(hud.getLevel() == 55) {
				handler.clearEnemys();
				AudioPlayer.getMusic("boss_normal").stop();
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				AudioPlayer.getMusic("play_normal").loop();
				}
				else if(hud.getLevel() == 56) {
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 57) {
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));	
				}
				else if(hud.getLevel() == 58) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 59) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				if(hud.getLevel() == 60) {
				handler.clearEnemys();
				AudioPlayer.getMusic("boss_normal").stop();
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				AudioPlayer.getMusic("play_normal").loop();
				}
				
				
				
				
				
			}
			if(game.diff == 1) {
				if(hud.getLevel() == 2) {
					AudioPlayer.getMusic("menu").stop();
					AudioPlayer.getMusic("play_hard").loop();
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 3) { 
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 4) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));	
				}
				else if(hud.getLevel() == 5) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				else if(hud.getLevel() == 6) {
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));	
				}
				else if(hud.getLevel() == 7) {
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));	
				}
				else if(hud.getLevel() == 8) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));	
				}
				else if(hud.getLevel() == 9) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				else if(hud.getLevel() == 10) {
					handler.clearEnemys();
					AudioPlayer.getMusic("play_hard").stop();
					AudioPlayer.getMusic("boss_hard").loop();
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
				}
				else if(hud.getLevel() == 15) { 
					handler.clearEnemys();
					AudioPlayer.getMusic("boss_hard").stop();
					AudioPlayer.getMusic("play_hard").loop();
					
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));	
					
				}
				else if(hud.getLevel() == 16) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 17) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				else if(hud.getLevel() == 18) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					
				}
				else if(hud.getLevel() == 19) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					
				}
				else if(hud.getLevel() == 20) {
					AudioPlayer.getMusic("play_hard").stop();
					AudioPlayer.getMusic("boss_hard").loop();
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));	
				}
				else if(hud.getLevel() == 20) {
					handler.clearEnemys();
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
				}
				else if(hud.getLevel() == 25) {
					AudioPlayer.getMusic("boss_hard").stop();
					AudioPlayer.getMusic("play_hard").loop();
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 26) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				else if(hud.getLevel() == 27) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					
				}
				else if(hud.getLevel() == 28) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					
				}
				else if(hud.getLevel() == 29) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));	
				}
				else if(hud.getLevel() == 30) {
					handler.clearEnemys();
					AudioPlayer.getMusic("play_hard").stop();
					AudioPlayer.getMusic("boss_hard").loop();
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				}
				else if(hud.getLevel() == 35) {
					AudioPlayer.getMusic("boss_hard").stop();
					AudioPlayer.getMusic("play_hard").loop();
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 36) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				else if(hud.getLevel() == 37) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					
				}
				else if(hud.getLevel() == 38) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					
				}
				else if(hud.getLevel() == 39) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));	
				}
				else if(hud.getLevel() == 40) {
					handler.clearEnemys();
					AudioPlayer.getMusic("play_hard").stop();
					AudioPlayer.getMusic("boss_hard").loop();
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				}
				else if(hud.getLevel() == 45) {
					AudioPlayer.getMusic("boss_hard").stop();
					AudioPlayer.getMusic("play_hard").loop();
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 46) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				else if(hud.getLevel() == 47) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					
				}
				else if(hud.getLevel() == 48) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					
				}
				else if(hud.getLevel() == 49) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));	
				}
				else if(hud.getLevel() == 50) {
					handler.clearEnemys();
					AudioPlayer.getMusic("play_hard").stop();
					AudioPlayer.getMusic("boss_hard").loop();
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				}
				else if(hud.getLevel() == 55) {
					AudioPlayer.getMusic("boss_hard").stop();
					AudioPlayer.getMusic("play_hard").loop();
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 56) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				else if(hud.getLevel() == 57) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					
				}
				else if(hud.getLevel() == 58) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					
				}
				else if(hud.getLevel() == 59) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));	
				}
				else if(hud.getLevel() == 60) {
					handler.clearEnemys();
					AudioPlayer.getMusic("play_hard").stop();
					AudioPlayer.getMusic("boss_hard").loop();
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				}
				else if(hud.getLevel() == 65) {
					AudioPlayer.getMusic("boss_hard").stop();
					AudioPlayer.getMusic("play_hard").loop();
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}
				else if(hud.getLevel() == 66) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
				}
				else if(hud.getLevel() == 67) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					
				}
				else if(hud.getLevel() == 68) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					
				}
				else if(hud.getLevel() == 69) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));	
				}
				else if(hud.getLevel() == 70) {
					handler.clearEnemys();
					AudioPlayer.getMusic("play_hard").stop();
					AudioPlayer.getMusic("boss_hard").loop();
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));	
					handler.addObject(new EnemyBoss((Game.WIDTH / 2)-48 ,- 120, ID.EnemyBoss, handler));
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				}
			}
		
		}
				
		
		
	}
	
	
}
