import javax.swing.JButton;

public class Tiles extends JButton {
	
	private JButton gameTile; // any particular tile on the board represented by a JButton
	private boolean wall;
	private boolean tile;
	private boolean door;
	private boolean room;

	public boolean getRoom() {
		return room;
	}

	public void setRoom(boolean b) {
		if (b == true) {
			this.room = true;
		}
		else this.room = false;
	}

	public Tiles() {
		gameTile = new JButton();
	}
	
	public void setWall(boolean b) {
		if (b == true) {
			this.wall = true;
		}
		else this.wall = false;
	}
	
	public String toString(int i, int j) {
		return "[" + i + ", " + j +"]" 
				+ "[wall = " + wall + "]"
				+ "[room = " + room + "]"
				+ "[tile = " + tile + "]"
				+ "[door = " + door + "]";
	}

	
	public boolean getWall() {
		return wall;
	}
	
	public void setTile(boolean b) {
		if (b == true) {
			this.tile = true;
		}
		else this.tile = false;
	}
	
	public boolean getTile() {
		return tile;
	}
	
	public void setDoor(boolean b) {
		if (b == true) {
			this.door = true;
		}
		else this.door = false;
	}
	
	public boolean getDoor() {
		return door;
	}
	
	
}