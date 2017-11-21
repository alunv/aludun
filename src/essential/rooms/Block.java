package essential.rooms;

/**
 * 
 * @author alunv
 * This interface is implemented by all classes
 * which objects should be placed in a <code>Room</code> object.
 */
public enum Block implements Placeable {
	
	WALL('%'),
	EMPTY('.'),
	PLAYER('@'),
	
	ROCK('#');
	
	private char block;
	
	Block(char c) {
		block = c;
	}
	
	public char getBlock() {
		return block;
	}
}
