import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board {
			
	private JFrame gameFrame;  // window of the game
	private Canvas gameCanvas; // where the board is drawn
	
	private String title;
	private int width, height;
	
	JButton[] tileButtons = new JButton[325];
	JPanel buttonPanel= new JPanel(new GridLayout(18,18));
	
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
		gameFrame.setResizable(true); // can't resize
		gameFrame.setLocationRelativeTo(null); // centered
		gameFrame.add(TileButtons());
		gameFrame.setVisible(true);
			
		
	}
	
	/** Tile #s
	 * 
	 * Kitchen: 0,1,2,3,4,18,19,20,21,22,36,37,38,39,40 (done) 
	 * Ballroom: 7 8 9 / 24 - 28 / 42 - 46 / 60 - 64 (done)
	 * Conservatory:  14 - 17 / 32 - 35 / 50 - 53 / 69-71 (done)
	 * Dining room: 108 - 112 / 126 - 130 / 144 - 148 / 162 - 166 / 180- 184 (done)
	 * Staircase / middle space: 115 - 119 / 133 - 137 / 151 - 155 / 169 - 173 / 187-191 (done)
	 * Billiard room: 104-107 / 122-125 / 140 - 143 (done)
	 * Library: 194 - 197 / 212 - 215/ 230-233 (done)
	 * Study: 284 - 287 / 302 - 305 / 320-323
	 * Hall: 241 - 245 / 259 - 263 / 277 - 281 / 295 - 299 / 313 - 317
	 * Lounge: 252 - 256 / 270 - 274 / 288 - 292 / 306 - 310 
	 * 
	 */
	
	
	public JPanel TileButtons() {
			
		// creates all tiles
		for(int i = 0; i < 324; i++) {
			tileButtons[i] = new JButton();
			tileButtons[i].addActionListener(new ButtonListener(i));
			tileButtons[i].setEnabled(false);
			//tileButtons[i].setText("" +i);
				
				
			buttonPanel.add(tileButtons[i]);
		}
		
		// lounge
		for (int tt = 252; tt< 257; tt++) {
			tileButtons[tt].setBackground(Color.BLUE);
			tileButtons[tt].setEnabled(false);
			tileButtons[tt].setBorderPainted(false);
			
			for(int uu = 270; uu<275; uu++) {
				tileButtons[uu].setBackground(Color.BLUE);
				tileButtons[uu].setEnabled(false);
				tileButtons[uu].setBorderPainted(false);
										
					for(int xx = 288; xx<293; xx++) {
						tileButtons[xx].setBackground(Color.BLUE);
						tileButtons[xx].setEnabled(false);
						tileButtons[xx].setBorderPainted(false);
						
						for(int yy = 306; yy<311; yy++) {
							tileButtons[yy].setBackground(Color.BLUE);
							tileButtons[yy].setEnabled(false);
							tileButtons[yy].setBorderPainted(false);
						}
					}
				}
			}
		
		
		// hall
		for (int oo = 241; oo < 246; oo++) {
			tileButtons[oo].setBackground(Color.BLUE);
			tileButtons[oo].setEnabled(false);
			tileButtons[oo].setBorderPainted(false);
			
			for( int pp = 259; pp < 264; pp++) {
				tileButtons[pp].setBackground(Color.BLUE);
				tileButtons[pp].setEnabled(false);
				tileButtons[pp].setBorderPainted(false);
				
				for( int qq = 277; qq < 282; qq++) {
					tileButtons[qq].setBackground(Color.BLUE);
					tileButtons[qq].setEnabled(false);
					tileButtons[qq].setBorderPainted(false);
					
					for( int rr = 295; rr < 300; rr++) {
						tileButtons[rr].setBackground(Color.BLUE);
						tileButtons[rr].setEnabled(false);
						tileButtons[rr].setBorderPainted(false);
						
						for( int ss = 313; ss < 318; ss++) {
							tileButtons[ss].setBackground(Color.BLUE);
							tileButtons[ss].setEnabled(false);
							tileButtons[ss].setBorderPainted(false);
						}
					}
				}
			}
		}
		
		// study
		for (int jj = 284; jj<288; jj++) {
			tileButtons[jj].setBackground(Color.BLUE);
			tileButtons[jj].setEnabled(false);
			tileButtons[jj].setBorderPainted(false);
			
			for (int mm = 302; mm<306; mm++) {
				tileButtons[mm].setBackground(Color.BLUE);
				tileButtons[mm].setEnabled(false);
				tileButtons[mm].setBorderPainted(false);
				
				for (int nn = 320; nn<324; nn++) {
					tileButtons[nn].setBackground(Color.BLUE);
					tileButtons[nn].setEnabled(false);
					tileButtons[nn].setBorderPainted(false);
				}
			}
		}
		
		// library room
		for (int ii = 194; ii < 198; ii++) {
			tileButtons[ii].setBackground(Color.BLUE);
			tileButtons[ii].setEnabled(false);
			tileButtons[ii].setBorderPainted(false);

			for (int kk = 212; kk < 216; kk++) {
				tileButtons[kk].setBackground(Color.BLUE);
				tileButtons[kk].setEnabled(false);
				tileButtons[kk].setBorderPainted(false);

				for (int ll = 230; ll < 234; ll++) {
					tileButtons[ll].setBackground(Color.BLUE);
					tileButtons[ll].setEnabled(false);
					tileButtons[ll].setBorderPainted(false);
				}
			}
		}
		
		// billiard room
		for(int ff = 104; ff < 108; ff++) {
			tileButtons[ff].setBackground(Color.BLUE);
			tileButtons[ff].setEnabled(false);
			tileButtons[ff].setBorderPainted(false);
			
			for(int gg = 122; gg < 126; gg++) {
				tileButtons[gg].setBackground(Color.BLUE);
				tileButtons[gg].setEnabled(false);
				tileButtons[gg].setBorderPainted(false);
			
				for(int hh = 140; hh < 144; hh++) {
					tileButtons[hh].setBackground(Color.BLUE);
					tileButtons[hh].setEnabled(false);
					tileButtons[hh].setBorderPainted(false);
				}
			}
		}
		
		// staircase
		for(int bb = 115; bb < 120; bb++) {
			tileButtons[bb].setBackground(Color.BLUE);
			tileButtons[bb].setEnabled(false);
			tileButtons[bb].setBorderPainted(false);
			
			for(int cc = 133; cc < 138; cc++) {
				tileButtons[cc].setBackground(Color.BLUE);
				tileButtons[cc].setEnabled(false);
				tileButtons[cc].setBorderPainted(false);
			
				for(int dd = 151; dd < 156; dd++) {
					tileButtons[dd].setBackground(Color.BLUE);
					tileButtons[dd].setEnabled(false);
					tileButtons[dd].setBorderPainted(false);
				
					for(int ee = 169; ee < 174; ee++) {
						tileButtons[ee].setBackground(Color.BLUE);
						tileButtons[ee].setEnabled(false);
						tileButtons[ee].setBorderPainted(false);
						
						for(int aa = 187; aa < 192; aa++) {
							tileButtons[aa].setBackground(Color.BLUE);
							tileButtons[aa].setEnabled(false);
							tileButtons[aa].setBorderPainted(false);
						}
					}
				}
			}
		}
		
		
		// Dining Room
		Color blue = new Color(0,0,100);
		for(int a = 108; a < 113; a++) {
			tileButtons[a].setBackground(blue);
			tileButtons[a].setEnabled(false);
			tileButtons[a].setBorderPainted(false);
			
			for(int f = 126; f < 131; f++) {
				tileButtons[f].setBackground(blue);
				tileButtons[f].setEnabled(false);
				tileButtons[f].setBorderPainted(false);
			
				for(int i = 144; i < 149; i++) {
					tileButtons[i].setBackground(blue);
					tileButtons[i].setEnabled(false);
					tileButtons[i].setBorderPainted(false);
				
					for(int d = 162; d < 167; d++) {
						tileButtons[d].setBackground(blue);
						tileButtons[d].setEnabled(false);
						tileButtons[d].setBorderPainted(false);
						
						for(int aa = 180; aa < 185; aa++) {
							tileButtons[aa].setBackground(blue);
							tileButtons[aa].setEnabled(false);
							tileButtons[aa].setBorderPainted(false);
						}
					}
				}
			}
		}
		
		
		//Conservatory:
		for(int a = 14; a < 18; a++) {
			tileButtons[a].setBackground(Color.BLUE);
			tileButtons[a].setEnabled(false);
			tileButtons[a].setBorderPainted(false);
			
			for(int b = 32; b < 36; b++) {
				tileButtons[b].setBackground(Color.BLUE);
				tileButtons[b].setEnabled(false);
				tileButtons[b].setBorderPainted(false);
			
				for(int c = 50; c < 54; c++) {
					tileButtons[c].setBackground(Color.BLUE);
					tileButtons[c].setEnabled(false);
					tileButtons[c].setBorderPainted(false);
				
					for(int d = 69; d < 72; d++) {
						tileButtons[d].setBackground(Color.BLUE);
						tileButtons[d].setEnabled(false);
						tileButtons[d].setBorderPainted(false);
						
					}
				}
			}
		}
			
				
					
		
		// kitchen 
		for(int j = 0; j < 5; j++) {
			tileButtons[j].setBackground(Color.BLUE);
			tileButtons[j].setEnabled(false);
			tileButtons[j].setBorderPainted(false);
			
			for(int k = 18; k < 23; k++) {
				tileButtons[k].setBackground(Color.BLUE);
				tileButtons[k].setEnabled(false);
				tileButtons[k].setBorderPainted(false);
				
				
				for(int l = 36; l < 41; l++) {
					tileButtons[l].setBackground(Color.BLUE);
					tileButtons[l].setEnabled(false);
					tileButtons[l].setBorderPainted(false);
					
				}
			}
		}
		
			
        // ballroom
		for(int m = 7; m < 10; m++) {
			tileButtons[m].setBackground(Color.BLUE);
			tileButtons[m].setEnabled(false);
			tileButtons[m].setBorderPainted(false);
				
			for(int n = 24; n < 29; n++) {
				tileButtons[n].setBackground(Color.BLUE);
				tileButtons[n].setEnabled(false);
				tileButtons[n].setBorderPainted(false);
					
				for(int o = 42; o < 47; o++) {
						tileButtons[o].setBackground(Color.BLUE);
						tileButtons[o].setEnabled(false);
						tileButtons[o].setBorderPainted(false);
				
					for(int p = 60; p <65; p++) {
						tileButtons[p].setBackground(Color.BLUE);
						tileButtons[p].setEnabled(false);
						tileButtons[p].setBorderPainted(false);
					}
				}
			}
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


public Canvas getGameCanvas() {
	return gameCanvas;
	}
}
