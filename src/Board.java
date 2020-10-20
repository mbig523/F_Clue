import java.awt.*;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;

// this class will create the game board
public class Board extends JPanel {
	
	private String title;
	private int width;
	private int height;
	
	private JButton[][] boardTiles;
	private JPanel boardPanel;	
	
	private JPanel detectivePanel;
	private JLabel detectiveCard;
	
	Image door;
	
	
	public Board(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		GameFrame();
		
		
	}
	
	private JPanel FrameLabels() {
		detectivePanel = new JPanel();
		detectivePanel.setPreferredSize(new Dimension(500,800));
		
		detectiveCard = new JLabel("Menu/Detective Card Side");
		detectivePanel.add(detectiveCard);
		
		
		return detectivePanel;
	}
	
	private void GameFrame () {

		JFrame gameFrame = new JFrame(title);
		gameFrame.setLayout(new BorderLayout());
		gameFrame.add(MakeBoard(), BorderLayout.CENTER);
		gameFrame.add(FrameLabels(), BorderLayout.EAST);
		
		gameFrame.setBackground(Color.LIGHT_GRAY);
		gameFrame.setSize(new Dimension(width, height));
		gameFrame.setResizable(true);
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		gameFrame.setVisible(true);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private JPanel MakeBoard() {
		int row = 18;
		int col = 18;
		
		boardPanel = new JPanel();
		boardPanel.setLayout(new GridLayout(row,col,-1,-1));
		boardTiles = new JButton[row][col];
		
		for(int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
			boardTiles[i][j] = new JButton();
			boardTiles[i][j].setEnabled(false);
			boardTiles[i][j].setFont(new Font("Arial", Font.BOLD, 12));
			// boardTiles[i][j].setText("<html> i: " + i  + "<br> j: "+ j + "</html>"); // comment out this to remove button text
			boardPanel.add(boardTiles[i][j]);
			}
		}
		
		try {
			door = ImageIO.read(new File("src/door.png")).getScaledInstance(50,50, Image.SCALE_DEFAULT);
		}
		catch (Exception e) {
			
		}
		//kitchen
		for(int j = 0; j<5; j++) {
			for (int i =0; i<3; i++) {
				boardTiles[i][j].setBorderPainted(false);
				boardTiles[i][j].setBackground(Color.BLACK);
				
				if (i == 2 && j == 3) {
					boardTiles[i][j].setBackground(null);
					boardTiles[i][j].setIcon(new ImageIcon(door));
					boardTiles[i][j].setBorderPainted(true);
				}
				
			}
		}
		
		//Ball room
		for(int j = 7; j<11; j++) {
				int i = 0;
				boardTiles[i][j].setBorderPainted(false);
				boardTiles[i][j].setBackground(Color.BLACK);
			
			for (int b = 6; b < 12; b++) {
				for (int a = 1; a <4; a++) {
					boardTiles[a][b].setBorderPainted(false);
					boardTiles[a][b].setBackground(Color.BLACK);
					
														
				}
			}				
		}
		
		// i'm not proud of this block of code but its the only way
		// i could get doors in those spots of the ballroom
		boardTiles[2][6].setBackground(null);
		boardTiles[2][6].setIcon(new ImageIcon(door));
		boardTiles[2][6].setBorderPainted(true);
		boardTiles[3][7].setBackground(null);;
		boardTiles[3][7].setIcon(new ImageIcon(door));
		boardTiles[3][7].setBorderPainted(true);
		boardTiles[2][11].setBackground(null);
		boardTiles[3][10].setBackground(null);;
		boardTiles[2][11].setIcon(new ImageIcon(door));
		boardTiles[3][10].setIcon(new ImageIcon(door));
		boardTiles[2][11].setBorderPainted(true);
		boardTiles[3][10].setBorderPainted(true);
	
		
		//conservatory
		
		for (int j = 14; j<18; j++) {
			for (int i = 0; i<4; i++) {
				boardTiles[i][j].setBorderPainted(false);
				boardTiles[i][j].setBackground(Color.BLACK);
				
				if (i == 3 && j == 14) {
					boardTiles[i][j].setBackground(null); // door to conservatory [3,14]
					boardTiles[i][j].setIcon(new ImageIcon(door));
					boardTiles[i][j].setBorderPainted(true);
				}
			}
		}
		
		
		// dining room
		
		for (int j = 0; j<5; j++) {
			for (int i = 6; i<11; i++) {
				boardTiles[i][j].setBorderPainted(false);
				boardTiles[i][j].setBackground(Color.BLACK);
				
				if (i == 7 && j == 4) {
					boardTiles[i][j].setBackground(null); // door to kitchen [7,4]
					boardTiles[i][j].setIcon(new ImageIcon(door));
					boardTiles[i][j].setBorderPainted(true);
				}
				
				if (i == 10 && j == 3) {
					boardTiles[i][j].setBackground(null); // door to kitchen [10,3]
					boardTiles[i][j].setIcon(new ImageIcon(door));
					boardTiles[i][j].setBorderPainted(true);
				}
			}
		}
		
		// middle area
		
		for (int j = 7; j<12; j++) {
			for (int i= 6; i< 11; i++) {
				boardTiles[i][j].setBorderPainted(false);
				boardTiles[i][j].setBackground(Color.BLACK);
			}
		}
		
		//billiard room
		for (int j = 14; j<18; j++) {
			for (int i = 5; i<8; i++) {
				boardTiles[i][j].setBorderPainted(false);
				boardTiles[i][j].setBackground(Color.BLACK);
				
				if (i == 5 && j == 14) {
					boardTiles[i][j].setBackground(null); // door to billiard  [5,14]
					boardTiles[i][j].setIcon(new ImageIcon(door));
					boardTiles[i][j].setBorderPainted(true);
				}
				
				if (i == 7 && j == 16) {
					boardTiles[i][j].setBackground(null); // door to billiard  [7,14]
					boardTiles[i][j].setIcon(new ImageIcon(door));
					boardTiles[i][j].setBorderPainted(true);
				}
	
			}
		}
		
		// library
		
		for (int j = 14; j<18; j++) {
			for(int i = 10; i<13; i++) {
				boardTiles[i][j].setBorderPainted(false);
				boardTiles[i][j].setBackground(Color.BLACK);
				
				if (i == 11 && j == 14) {
					boardTiles[i][j].setBackground(null); // door to billiard  [11,14]
					boardTiles[i][j].setIcon(new ImageIcon(door));
					boardTiles[i][j].setBorderPainted(true);
				}
				
				if (i == 10 && j == 15) {
					boardTiles[i][j].setBackground(null); // door to billiard  [10,15]
					boardTiles[i][j].setIcon(new ImageIcon(door));
					boardTiles[i][j].setBorderPainted(true);
				}
				
			}
		}
		
		// lounge
		
		for (int j = 0; j<5; j++) {
			for (int i = 14; i<18; i++) {
				boardTiles[i][j].setBorderPainted(false);
				boardTiles[i][j].setBackground(Color.BLACK);
				
				if (i == 14 && j == 4) {
					boardTiles[i][j].setBackground(null); // door to billiard  [14,4]
					boardTiles[i][j].setIcon(new ImageIcon(door));
					boardTiles[i][j].setBorderPainted(true);
				}
			}
		}
		
		// hall
		
		for (int j = 7; j< 12; j++) {
			for (int i = 13; i< 18; i++) {
				boardTiles[i][j].setBorderPainted(false);
				boardTiles[i][j].setBackground(Color.BLACK);
				
				if (i == 13 && j == 9) {
					boardTiles[i][j].setBackground(null); // door to billiard  [13,9]
					boardTiles[i][j].setIcon(new ImageIcon(door));
					boardTiles[i][j].setBorderPainted(true);
				}
				
				if (i == 14 && j == 11) {
					boardTiles[i][j].setBackground(null); // door to billiard  [14,11]
					boardTiles[i][j].setIcon(new ImageIcon(door));
					boardTiles[i][j].setBorderPainted(true);
				}
			}
		}
		
		// study
		
		for (int j = 14; j< 18; j++) {
			for (int i = 15; i< 18; i++) {
				boardTiles[i][j].setBorderPainted(false);
				boardTiles[i][j].setBackground(Color.BLACK);
				
				if (i == 15 && j == 14) {
					boardTiles[i][j].setBackground(null); // door to billiard  [15,14]
					boardTiles[i][j].setIcon(new ImageIcon(door));
					boardTiles[i][j].setBorderPainted(true);
				}
			}
		}
		
		
		
		
		
		return boardPanel;
		
	}
	
	private JPanel RoomLabels() {
		JLabel kitchen, ballRoom, conservatory, diningRoom, center,  billiardRoom, lounge, hall, library, study;
		kitchen = new JLabel("Kitchen");
		ballRoom = new JLabel("BallRoom");
		conservatory = new JLabel("Conservatory");
		diningRoom = new JLabel("Dining Room");
		center = new JLabel("Clue");
		billiardRoom = new JLabel("Billiard Room");
		lounge = new JLabel("Lounge");
		hall = new JLabel("Hall");
		library = new JLabel("Library");
		study = new JLabel("Study");
		
		JPanel roomLabels = new JPanel();
		roomLabels.setLayout(null);
		roomLabels.add(kitchen);
		roomLabels.add(ballRoom);
		roomLabels.add(conservatory);
		roomLabels.add(diningRoom);
		roomLabels.add(center);
		roomLabels.add(billiardRoom);
		roomLabels.add(lounge);
		roomLabels.add(hall);
		roomLabels.add(library);
		roomLabels.add(study);
		
		
		
		roomLabels.setSize(720, 720);
		roomLabels.setLocation(0,0);
		
		
		return roomLabels;
	}

	
	
	
}
