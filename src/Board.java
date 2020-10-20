import java.awt.*;

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
		gameFrame.setResizable(false);
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setVisible(true);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// gameFrame.add(new GameCanvas());
		// gameFrame.add(RoomLabels());
	}
	
	private JPanel MakeBoard() {
		int row = 18;
		int col = 18;
		
		boardPanel = new JPanel();
		boardPanel.setLayout(new GridLayout(18,18,-1,-1));
		boardTiles = new JButton[col][row];
		
		for(int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
			boardTiles[i][j] = new JButton();
			boardTiles[i][j].setEnabled(false);
			//boardTiles[i][j].setPreferredSize(new Dimension(50,50));
			boardPanel.add(boardTiles[i][j]);
			}
		}
		
		//kitchen
		for(int j = 0; j<5; j++) {
			for (int i =0; i<3; i++) {
				boardTiles[i][j].setBorderPainted(false);
				boardTiles[i][j].setBackground(Color.LIGHT_GRAY);
			}
		}
		
		//Ball room
		for(int j = 7; j<10; j++) {
				int i = 0;
				boardTiles[i][j].setBorderPainted(false);
				boardTiles[i][j].setBackground(Color.LIGHT_GRAY);
			
			for (int b = 6; b < 11; b++) {
				for (int a = 1; a <4; a++) {
					boardTiles[a][b].setBorderPainted(false);
					boardTiles[a][b].setBackground(Color.LIGHT_GRAY);
				}
			}				
		}
	
		
		//conservatory
		
		for (int j = 13; j<18; j++) {
			for (int i = 0; i<4; i++) {
				boardTiles[i][j].setBorderPainted(false);
				boardTiles[i][j].setBackground(Color.LIGHT_GRAY);
				
				if (i == 3 && j == 13) {
					boardTiles[i][j].setBackground(null); // door to conservatory
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
