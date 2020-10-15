import java.awt.*;
import java.awt.image.BufferStrategy;

// this class will probably hold most of the code

public class Game /**implements Runnable */{

	public String title;
	public int width, height;
	
	
	// constructor for game title and size
	public Game(String title, int width, int height) {
				
		this.width = width;
		this.height = height;
		this.title = title;
		new Board(title, width, height);
		
	}
			
}
