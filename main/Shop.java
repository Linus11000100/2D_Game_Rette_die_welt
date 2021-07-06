package game.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Shop extends MouseAdapter {
	
	Handler handler;
	HUD hud;
	
	private int b1 = 1000;
	private int b2 = 1000;
	private int b3 = 1000;
	
	
	public Shop(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	
	
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("arial", 0,48));
		g.drawString("SHOP", Game.WIDTH/2-80,	50);
		
		g.setFont(new Font("arial", 0,12));
		g.drawString("Upgrade Leben", 110, 120);
		g.drawString("Kosten " + b1, 115, 140);
		g.drawRect(100, 100, 100, 80);
		
		
		g.drawString("Upgrade Speed", 260, 120);
		g.drawString("Kosten " + b2, 267, 140);
		g.drawRect(250, 100, 100, 80);
		
		
		g.drawString("Leben Auffüllen", 408, 120);
		g.drawString("Kosten " + b3, 417, 140);
		g.drawRect(400, 100, 100, 80);
		g.setColor(Color.red);
		g.setFont(new Font("arial", 0,30));
		g.drawString("SCORE: " + hud.getScore(), Game.WIDTH/2-90, 330);
		g.setFont(new Font("arial", 0,25));
		g.drawString("Drück Space oder ESC um zurück zu kommen", Game.WIDTH/2-265, 400);
		
		
		
		
	}
	
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		if(mx >= 100 && mx <=200) {
			if(my >= 100 && my <= 180) {
				if(hud.getScore() >= b1) {
					hud.setScore(hud.getScore() - b1);
					b1 *= 1000;
					hud.bounds += 20;
					hud.HEALTH = (100 + (hud.bounds/2));
					
				}
					
			}
		}
		if(mx >= 250 && mx <=350) {
			if(my >= 100 && my <= 180) {
				if(hud.getScore() >= b1) {
					hud.setScore(hud.getScore() - b2);
					b2 *= 1000;
					handler.spd ++;
					
				}
					
			
			}
		}
		
		if(mx >= 400 && mx <= 500) {
			if(my >= 100 && my <= 180) {
				if(hud.getScore() >= b1) {
					hud.setScore(hud.getScore() - b3);
					hud.HEALTH = (100 + (hud.bounds/2)); 
					
				}
					
			
				
			}
		}
		
				
	}
	
}
