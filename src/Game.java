// this class will probably hold most of the code

public class Game {

	private Board board;
	
	public int width, height;
		
	public Game(String title, int width, int height) {
				
		this.width = width;
		this.height = height;
		board = new Board(title, width, height);
	}
}
