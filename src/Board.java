import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board {
			
	private JFrame gameFrame;  // window of the game
	private Canvas gameCanvas; // where the board is drawn
	
	private String title;
	private int width, height;
	
	public Board(String title, int width, int height) {
		
		this.title = title;
		this.width = width;
		this.height = height;
		
		CreateBoard();
	}
	
	private void CreateBoard() {
		
		// creation of game window
		gameFrame = new JFrame(title);
		gameFrame.setSize(width, height);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // game closes on pressing x 
		gameFrame.setResizable(false); // can't resize
		gameFrame.setLocationRelativeTo(null); // centered
		gameFrame.setVisible(true);
		
		// Canvas object with set size that can't be changed
		gameCanvas = new Canvas();
		gameCanvas.setPreferredSize(new Dimension(width, height));
		gameCanvas.setMinimumSize(new Dimension(width, height));
		gameCanvas.setMaximumSize(new Dimension(width, height));
		
		// Adds to frame and resizes window to fully see canvas (pack)
		gameFrame.add(gameCanvas);
		gameFrame.pack();
	}
}