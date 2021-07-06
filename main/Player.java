package game.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Player extends GameObject {

	Random r = new Random();
	Handler handler;
	
	private BufferedImage player_Image;
	
	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		
		SpriteSheet ss = new SpriteSheet(Game.sprite_sheet);
		
		player_Image = ss.grabImage(1, 1, 32, 32);
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 32,32);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		x = Game.clamp(x, 0, Game.WIDTH -48);
		y = Game.clamp(y, 0, Game.HEIGHT -70);
		
		//handler.addObject(new Trail(x, y, ID.Trail,Color.white, 32,32,0.05f, handler));
		
		collision();
	}
	
	private void collision() {
		for(int i = 0; i< handler.object.size(); i++) {
			
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.BasicEnemy || tempObject.getId() == ID.FastEnemy || tempObject.getId() == ID.SmartEnemy) {
				if(getBounds().intersects(tempObject.getBounds())) {
					HUD.HEALTH -=2;
				}
			}
		}
	}

	
	public void render(Graphics g) {
		
		//Graphics2D g2d = (Graphics2D) g;
		
		//g.setColor(Color.white);
	//	g.fillRect((int)x, (int)y, 32, 32);
		g.drawImage(player_Image, (int)x, (int)y, null);
		
	}


	
	

}
