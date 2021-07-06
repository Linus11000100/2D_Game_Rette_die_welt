package game.main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas {


	private static final long serialVersionUID = 492636734070584756L;

	public Window(int width, int beight, String title, Game game) {
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, beight));
		frame.setMaximumSize(new Dimension(width, beight));
		frame.setMinimumSize(new Dimension(width, beight));
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(game);
		frame.setVisible(true);
		game.start();
		
		
	}
	
}
