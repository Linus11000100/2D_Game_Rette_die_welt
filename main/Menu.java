package game.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import game.main.Game.STATE;

public class Menu extends MouseAdapter{
	
	private Game game;
	private Handler handler;
	private HUD hud;
	private Random r =new Random();
	
	public Menu(Game game,Handler handler,HUD hud) {
		this.game =game;
		this.handler = handler;
		this.hud = hud;
	}
	
	
	public void mousePressed(MouseEvent e) {
			int mx = e.getX();
			int my = e.getY();
			
			if(game.gameState == STATE.Menu) {
				//PlayButton
				if(mouseOver(mx,my,210,150,200,64)) {
					/*game.gameState = STATE.Game;
					handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player,handler));
					handler.clearEnemys();
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					AudioPlayer.getMusic("music").loop();
					AudioPlayer.getSound("menu_sound").play();
					*/
					//AudioPlayer.getMusic("music").loop();
					AudioPlayer.getSound("klick_sound").play();
					game.gameState = STATE.Select;
					
					return;
				}
				
				//help BUtton
				if(mouseOver(mx,my,210,250,200,64)) {
					
					AudioPlayer.getSound("klick_sound").play();
					game.gameState = STATE.Help;
				}
				
				
				
				//exit
				if(mouseOver(mx,my,210,350,200,64)) {
					AudioPlayer.getSound("klick_sound").play();
					System.exit(1);
					
				}
				
			}
			if(game.gameState == STATE.Select) {
				//Normal Button
				if(mouseOver(mx,my,210,150,200,64)) {
					game.gameState = STATE.Game;
					handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player,handler));
					handler.clearEnemys();
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					game.diff = 0;
					
					AudioPlayer.getMusic("music").stop();
					AudioPlayer.getSound("klick_sound").play();
					
					
					
					
				}
				
				//hard BUtton
				if(mouseOver(mx,my,210,250,200,64)) {
					game.gameState = STATE.Game;
					handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player,handler));
					handler.clearEnemys();
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
					game.diff = 1;
					AudioPlayer.getMusic("music").stop();
					///AudioPlayer.getMusic("music").loop();
					AudioPlayer.getSound("klick_sound").play();
					
				}
				
				
				
				//back
				if(mouseOver(mx,my,210,350,200,64)) {
					//AudioPlayer.getSound("menu_sound").play();
					game.gameState = STATE.Menu;
					AudioPlayer.getSound("klick_sound").play();
					return;
					
				}
				
			}
			
			
			//backhelp
			if(game.gameState == STATE.Help){
				if(mouseOver(mx, my, 210, 350, 200, 64)){
				game.gameState = STATE.Menu;
				AudioPlayer.getSound("klick_sound").play();
				return;
				}
			}
			
			//Ende Menu
			if(game.gameState == STATE.End){
				if(mouseOver(mx, my, 210, 350, 200, 64)){
				game.gameState = STATE.Menu;
				hud.setLevel(1);
				hud.setScore(0);
				
				AudioPlayer.getSound("klick_sound").play();
				return;
				}
			}
			//Try Again Button
			if(game.gameState == STATE.End){
				AudioPlayer.getMusic("music").stop();
				if(mouseOver(mx, my, 210, 250, 200, 64)){
				game.gameState = STATE.Game;
				///AudioPlayer.getMusic("music").loop();
				hud.setLevel(1);
				hud.setScore(0);
				handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player,handler));
				handler.clearEnemys();
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50),r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				AudioPlayer.getSound("klick_sound").play();
				
				}
			}
			
	}
	
	public void mouseReleased(MouseEvent e) {
		
	}
	
	private boolean mouseOver(int mx,int my, int x,int y, int width,int height) {
		if(mx > x && mx < x + width) {
			if(my > y && my < y +height) {
				return true;
			}else return false;
		}else return false;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		if(game.gameState== STATE.Menu) {
			
			Font fnt = new Font("arial", 1, 50);
			Font fnt1 = new Font("arial", 1, 30);
			
			
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Menu", 240, 70);
			
			g.setFont(fnt1);
			g.drawRect(210, 150, 200, 64);
			g.drawString("Play", 270, 190);
			
			g.setColor(Color.white);
			g.drawRect(210, 250, 200, 64);
			g.drawString("Help", 270, 290);
			
			g.setColor(Color.white);
			g.drawRect(210, 350, 200, 64);
			g.drawString("Exit", 270, 390);
		}
		//Help Window 
		else if(game.gameState == STATE.Help) {
			Font fnt = new Font("arial", 1, 50);
			Font fnt1 = new Font("arial", 1, 30);
			Font fnt2 = new Font("arial", 1, 20);
			
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Help", 240, 70);
			
			g.setFont(fnt2);
			g.drawString("Use WASD To move", 180, 200);
			
			g.setFont(fnt1);
			g.drawRect(210, 350, 200, 64);
			g.drawString("Back", 270, 390);
		}	
			//Help Window 
			else if(game.gameState == STATE.End) {
				Font fnt = new Font("arial", 1, 50);
				Font fnt1 = new Font("arial", 1, 30);
				Font fnt2 = new Font("arial", 1, 25);
				
				g.setFont(fnt);
				g.setColor(Color.red);
				g.drawString("Game Over", 180, 70);
				
				g.setFont(fnt2);
				g.setColor(Color.white);
				g.drawString("Du verlierst mit " + hud.getScore()+ " Punkten", 140, 200);
				
				
				g.setFont(fnt1);
				g.setColor(Color.red);
				g.drawRect(210, 350, 200, 64);
				g.drawString("Menu", 270, 390);
				
				g.setFont(fnt1);
				g.setColor(Color.white);
				g.drawRect(210, 250, 200, 64);
				g.drawString("Try Again", 245, 290);
			}
			else if(game.gameState== STATE.Select) {
						
				Font fnt = new Font("arial", 1, 50);
				Font fnt1 = new Font("arial", 1, 30);
						
						
				g.setFont(fnt);
				g.setColor(Color.white);
				g.drawString("Auswahl", 240, 70);
						
				g.setFont(fnt1);
				g.drawRect(210, 150, 200, 64);
				g.drawString("Normal", 270, 190);
						
				g.setColor(Color.white);
				g.drawRect(210, 250, 200, 64);
				g.drawString("Hard", 270, 290);
						
				g.setColor(Color.white);
				g.drawRect(210, 350, 200, 64);
				g.drawString("Back", 270, 390);
			}
			
		}
}
