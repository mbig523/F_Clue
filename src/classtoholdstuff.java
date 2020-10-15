import javax.swing.JButton;

public class classtoholdstuff {

	
	
	/** Tile #s
	 * 
	 * Kitchen: 0,1,2,3,4,18,19,20,21,22,36,37,38,39,40 (done) 
	 * Ballroom: 7 8 9 / 24 - 28 / 42 - 46 / 60 - 64 (done)
	 * Conservatory:  14 - 17 / 32 - 35 / 50 - 53 / 69-71 (done)
	 * Dining room: 108 - 112 / 126 - 130 / 144 - 148 / 162 - 166 / 180- 184 (done)
	 * Staircase / middle space: 115 - 119 / 133 - 137 / 151 - 155 / 169 - 173 / 187-191
	 * Billiard room: 104-107 / 122-125 / 140 - 143
	 * Library: 194 - 197 / 212 - 215/ 230-233
	 * Study: 284 - 287 / 302 - 305 / 320-323
	 * Hall: 241 - 245 / 259 - 263 / 277 - 281 / 295 - 299 / 313 - 317
	 * Lounge: 252 - 256 / 270 - 274 / 288 - 292 / 306 - 310 
	 * 
	 
	JButton[] tileButtons = new JButton[325];
	
	public JPanel TileButtons() {
		JPanel buttonPanel = new JPanel(new GridLayout(18,18));
		
		
		for(int i = 0; i < 324; i++) {
			tileButtons[i] = new JButton();
			tileButtons[i].addActionListener(new ButtonListener(i));
			//tileButtons[i].setText("" +i);
				
				
			buttonPanel.add(tileButtons[i]);
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
	*/
}
