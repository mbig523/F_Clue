import java.awt.*;

import javax.swing.*;


// this class will create the game board
public class Board extends JPanel {
	
	private String title;
	private int width;
	private int height;
	
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
		Tiles[][] tiles = new Tiles[row][col];
		
		boardPanel = new JPanel();
		boardPanel.setLayout(new GridLayout(row, col, -1,-1));
		
		// array population
		for (int i = 0; i < tiles.length; i++) {
			for (int j = 0; j < tiles[0].length; j++) {
				tiles[i][j] = new Tiles();
				tiles[i][j].setEnabled(false);
				boardPanel.add(tiles[i][j]);
			}
		}
		
		//kitchen (top left)
		for(int i = 0; i<3; i++) {
			for (int j =0; j<5; j++) {
				tiles[i][j].setBorderPainted(false);
				tiles[i][j].setBackground(Color.BLACK);
				tiles[i][j].setRoom(true);
				
				//door(s)
				if (i == 2 && j == 3) {
					tiles[i][j].setBorderPainted(true);
					tiles[i][j].setDoor(true);
					tiles[i][j].setTile(true);
					tiles[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 2));
					}
				// walls
				if (i == 2) {
					if (j == 0 || j == 1 || j == 2) {
						tiles[i][j].setWall(true);
					}
					
				}
				
				if (j == 4) {
					if (i == 0 || i == 1 || i == 2) {
						tiles[i][j].setWall(true);
					}
					
				}
				
			}
					
		}
			
		
		// ball room (top middle)
		// top 3 squares
		for(int j = 7; j<11; j++) {
			int i = 0;
			tiles[i][j].setBorderPainted(false);
			tiles[i][j].setBackground(Color.BLACK);
			tiles[i][j].setRoom(true);
			tiles[i][j].setWall(true);
		
		// rest of room
		for (int b = 6; b < 12; b++) {
			for (int a = 1; a <4; a++) {
				tiles[a][b].setBorderPainted(false);
				tiles[a][b].setBackground(Color.BLACK);	
				tiles[a][b].setRoom(true);
				
				//door(s)
				if( (a == 2 && b ==6 )|| (a == 3 && b == 7) || ( a == 2 && b == 11 ) || (a ==3 && b ==10) ) {
					tiles[a][b].setDoor(true);
					tiles[a][b].setBorderPainted(true);
					tiles[a][b].setBorder(BorderFactory.createLineBorder(Color.red, 2));
				}
				
				// walls
				if( (a == 1 && b == 6) || (a == 3 && b == 6) || (a == 3 && b == 8) || (a == 3 && b == 9) || (a == 3 && b == 11) || (a == 1 && b == 11)) {
					tiles[a][b].setWall(true);
				}				
			}
		}				
	}
		
		
		// conservatory (top right)
		for (int i =0; i<4; i++) {
			for (int j =14; j< 18; j++) {
				tiles[i][j].setBackground(Color.BLACK);
				tiles[i][j].setBorderPainted(false);
				tiles[i][j].setRoom(true);
				
				//door
				if (i == 3 && j == 14) {
					tiles[i][j].setDoor(true);
					tiles[i][j].setBorderPainted(true);
					tiles[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 2));
				}
				//walls
				if(i == 3) {
					if(j == 15 || j == 16 || j == 17) {
						tiles[i][j].setWall(true);
						
					}
					
				}
				
				if(j == 14) {
					if (i == 0 || i == 1 || i ==1) {
						tiles[i][j].setWall(true);
					}
					
				}
				
				
			}
		}
		
		// dining room (middle left)
		
		for (int i = 6; i <11; i++) {
			for (int j = 0; j<5; j++) {
				tiles[i][j].setBackground(Color.BLACK);
				tiles[i][j].setBorderPainted(false);
				tiles[i][j].setRoom(true);
				
				//doors
				if(i == 7 && j == 4 || i == 10 && j == 3) {
					tiles[i][j].setDoor(true);
					tiles[i][j].setBorderPainted(true);
					tiles[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 2));
				}
				
				
				
				// walls
				if (i == 10) {
					if (j == 0 || j == 1 || j == 2) {
						tiles[i][j].setWall(true);
						
					}
					
				}
				
				if (i == 6) {
					if (j == 0 || j == 1 || j == 2 || j ==3) {
						tiles[i][j].setWall(true);
						
					}
				}
				
				if (j == 4) {
					if (i == 6 || i == 8 || i == 9 || i == 10) {
						tiles[i][j].setWall(true);
						
						
					}
					
				}
			}
		}
		
		// middle room
		
		for (int i = 6; i <11; i++) {
			for(int j = 7; j<12; j++) {
				tiles[i][j].setBackground(Color.BLACK);
				tiles[i][j].setBorderPainted(false);
				tiles[i][j].setWall(true);
				tiles[i][j].setRoom(true);
			}
		}
				
		// billiard room (middle top right)
		for (int i = 5; i <8; i++) {
			for (int j = 14; j<18; j++) {
				tiles[i][j].setBackground(Color.BLACK);
				tiles[i][j].setBorderPainted(false);
				tiles[i][j].setRoom(true);
				
				//doors 
				if (i == 5 && j == 14 || i == 7 && j == 16) {
					tiles[i][j].setDoor(true);
					tiles[i][j].setBorderPainted(true);
					tiles[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 2));
				}
				
				// walls
				if (i == 5) {
					if (j == 15 || j == 16 || j == 17) {
						tiles[i][j].setWall(true);
					}
				}
				
				if (i == 6 && j == 14) {
					tiles[i][j].setWall(true);
				}
				
				if (i == 7) {
					if (j == 14 || j == 15 || j == 17) {
						tiles[i][j].setWall(true);
					}
				}
			}
		}
		
		// library (middle bottom right)
		for (int i = 10; i< 13; i++) {
			for (int j = 14; j< 18; j++) {
				tiles[i][j].setBorderPainted(false);
				tiles[i][j].setBackground(Color.BLACK);
				tiles[i][j].setRoom(true);
				
				//doors
				if (i == 11 && j == 14 || i == 10 && j == 15) {
					tiles[i][j].setDoor(true);
					tiles[i][j].setBorderPainted(true);
					tiles[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 2));
				}
				
				//walls 
				if (i == 10) {
					if (j == 14 || j == 16 || j == 17) {
						tiles[i][j].setWall(true);
						
					}
				}
				
				if (i == 12) {
					if (j == 14 || j == 15 || j == 16 || j == 17) {
						tiles[i][j].setWall(true);
						
					}
				}
			}
		}
		
		// lounge (bottom left)
		for (int i = 14; i < 18; i++) {
			for (int j = 0; j<5; j++) {
				tiles[i][j].setBorderPainted(false);
				tiles[i][j].setBackground(Color.BLACK);
				tiles[i][j].setRoom(true);
				
				//doors
				
				if (i == 14 && j == 4) {
					tiles[i][j].setDoor(true);
					tiles[i][j].setBorderPainted(true);
					tiles[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 2));
				}
				
				//walls 
				if (i == 14) {
					if (j == 0 || j == 1 || j == 2 || j == 3) {
						tiles[i][j].setWall(true);
					}
				}
				
				if (j == 4) {
					if (i == 17 || i == 16 || i == 15) {
						tiles[i][j].setWall(true);
						}				
				}
				
				if (i == 17) {
					if (j < 5) {
						tiles[i][j].setWall(true);
					}
				}
			}
		}
		
		// hall (bottom middle)
		for (int i = 13; i< 18; i++) {
			for (int j = 7; j< 12; j++) {
				tiles[i][j].setBorderPainted(false);
				tiles[i][j].setBackground(Color.BLACK);
				tiles[i][j].setRoom(true);
				
				//doors
				
				if(i == 13 && j == 9 || i == 14 && j == 11) {
					tiles[i][j].setDoor(true);
					tiles[i][j].setBorderPainted(true);
					tiles[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 2));
				}
				
				//walls 
				if (i == 13 )
					if (j == 7 || j == 8 || j == 10 || j == 11) {
						tiles[i][j].setWall(true);
						
					}
				if (j == 7) {
					if (i == 14 || i == 15 || i == 16 || i == 17) {
						tiles[i][j].setWall(true);
						
					}
				}
				
				if (j == 11) {
					if (i == 15 || i == 16 || i == 17) {
						tiles[i][j].setWall(true);
						
					}
				}
				
			}
		}
		
		//Study (bottom right)
		for (int i = 15; i< 18; i++) {
			for (int j = 14; j< 18; j++) {
				tiles[i][j].setBorderPainted(false);
				tiles[i][j].setBackground(Color.BLACK);
				tiles[i][j].setRoom(true);
				
				//door
				if (i == 15 && j == 14) {
					tiles[i][j].setDoor(true);
					tiles[i][j].setBorderPainted(true);
					tiles[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 2));
				}
				
				if (i == 15) {
					if (j == 15 || j == 16 || j == 17) {
						tiles[i][j].setWall(true);
						
					}
				}
				
				if (i == 16 && j == 14 || i == 17 && j == 14) {
					tiles[i][j].setWall(true);
					
				}
			
			
			}
		}		
		
		// printing all tile information
		for (int i = 0; i < tiles.length; i++) {
			for (int j = 0; j < tiles[0].length; j++) {
				System.out.println(tiles[i][j].toString(i, j));
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
