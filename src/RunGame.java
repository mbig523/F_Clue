// this class will create objects of every component of the game and run the game

/* objects to create:
	 * 
	 * game board
	 * cards
	 * characters
	 * dice
	 * interfaces (detective card etc)
	 * 
	 * 
	*/

// this class will run the game

public class RunGame {
	
	public static void main(String args[]) {
		new Board("Clue", 1250, 800);
	}
}
