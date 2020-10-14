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
	
	public JPanel TileButtons() {
		JPanel buttonPanel = new JPanel(new GridLayout(18,18));
		int kitchen[] = new int[] {0,1,2,3,4,18,19,20,21,22,36,37,38,39,40};
		
		for(int i = 0; i < 324; i++) {
			tileButtons[i] = new JButton();
			tileButtons[i].addActionListener(new ButtonListener(i));
			tileButtons[i].setText(" " +i);
			
			
			for(int j = 0; j < kitchen.length; j++) {
				tileButtons[kitchen[j]].setBackground(Color.BLUE);
				
			}
			
			buttonPanel.add(tileButtons[i]);
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