import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameBoard {
	
	JButton[] tileButtons = new JButton[325];
	
	
	public void CreateBoard() {
		
		JFrame gameFrame = new JFrame();
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setSize(800,600);
		gameFrame.add(TileButtons());
		gameFrame.setVisible(true);
		
	}
	
	/** Tile #s
	 * 
	 * Kitchen: 0,1,2,3,4,18,19,20,21,22,36,37,38,39,40 (done) 
	 * Ballroom: 7 8 9 / 24 - 28 / 42 - 46 / 60 - 64
	 * Conservatory:  14 - 17 / 32 - 35 / 50 - 53 / 69-71
	 * Dining room: 108 - 112 / 126 - 130 / 144 - 148 / 162 - 166 / 180- 184
	 * Staircase / middle space: 115 - 119 / 133 - 137 / 151 - 155 / 169 - 173 / 187-191
	 * Billiard room: 104-107 / 122-125 / 140 - 143
	 * Library: 194 - 197 / 212 - 215/ 230-233
	 * Study: 284 - 287 / 302 - 305 / 320-323
	 * Hall: 241 - 245 / 259 - 263 / 277 - 281 / 295 - 299 / 313 - 317
	 * Lounge: 252 - 256 / 270 - 274 / 288 - 292 / 306 - 310 
	 * 
	 */
	
	public JPanel TileButtons() {
		JPanel buttonPanel = new JPanel(new GridLayout(18,18));
		
		
		for(int i = 0; i < 324; i++) {
			tileButtons[i] = new JButton();
			tileButtons[i].addActionListener(new ButtonListener(i));
			tileButtons[i].setText("" +i);
				
				
			buttonPanel.add(tileButtons[i]);
		}
		
		// kitchen 
		for(int j = 0; j < 5; j++) {
			tileButtons[j].setBackground(Color.BLUE);
			
			for(int k = 18; k < 23; k++) {
				tileButtons[k].setBackground(Color.BLUE);
				
				for(int l = 36; l < 41; l++) {
					tileButtons[l].setBackground(Color.BLUE);
					
				}
			}
			
        // ballroom
		
		}
		return buttonPanel;
	}
	
	
public class ButtonListener implements ActionListener {

	private int i;
	public ButtonListener(int i) {
		this.i = i;
	}
		
	public void actionPerformed(ActionEvent e) {
		tileButtons[i].setBackground(Color.BLACK);
			
	}
		
	}
	
	
}

// WIP