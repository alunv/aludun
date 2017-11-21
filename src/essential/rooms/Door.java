package essential.rooms;

public final class Door implements Placeable {
	
	@Override
	public char getBlock() {
		return '\u25a1'; //hollow box
	}
	
	public final Room destination;
	
	private boolean locked = false;
	
	public boolean isLocked() {
		return locked;
	}
	
	public Door(Room d) {
		destination = d;
	}
}
