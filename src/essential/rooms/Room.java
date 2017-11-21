package essential.rooms;

public class Room {
	
	final private int SIZE_X;
	final private int SIZE_Y;
	public final String name;
	
	Placeable[][] blocks;
	
	/**
	 * Fills the room with empty blocks and
	 * places walls.
	 */
	private void buildRoom() {
		
		for(int j=SIZE_Y-1;j>=0;--j) //because the cout prints up to down
			for(int i=0;i<SIZE_X;++i) {
				if((j == 0 || j == SIZE_Y - 1) || (i == 0 || i == SIZE_X - 1)) {
					//System.out.println("Placing block x = " + i +
					//	" y = " + j);
					blocks[i][j] = Block.WALL;
				}
				else {
					//System.out.println("Placing empty x = " + i +
					//		" y = " + j);
					blocks[i][j] = Block.EMPTY;
				}
		}
	
	}
	
	
	/**
	 * Prints the room's name and its content into <code>System.out</code>.
	 * Blocks are separated by spaces.
	 */
	public void printRoom() {
		System.out.printf("Current room: %s%n", name);
		for(int j=SIZE_Y-1;j>=0;--j) {
			for(int i=0;i<SIZE_X;++i) {
				System.out.print(blocks[i][j].getBlock());
				System.out.print(' ');
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * Places a <code>Placeable</code> object in the room with the given <code>x</code>
	 * and <code>y</code> coordinates.
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param p object to be placed
	 */
	public void place(int x, int y, Placeable p) {
		if(x < 0 || y < 0 || x >= SIZE_X || y >= SIZE_Y)
			throw new IllegalArgumentException("Invalid coordinate argument(s): x = " + x + " y = " + y);
		
		if(p != null)
			blocks[x][y] = p;
		else
			throw new NullPointerException("Placeable object is null");
	}
	
	/**
	 * Creates a new empty room and builds it.
	 * @param x room width
	 * @param y room height
	 * @param name room name
	 */
	public Room(int x, int y, String name) {
		
		if(x <= 0 || y <= 0)
			throw new IllegalArgumentException("Room size must be bigger than 0: x = " + 
												x + ", y = " + y);
		this.name = name;
		SIZE_X = x;
		SIZE_Y = y;
		blocks = new Placeable[SIZE_X][SIZE_Y];
		
		buildRoom();
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
