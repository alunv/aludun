package essential;

import essential.rooms.*;

public class TestClass {

	public static void main(String[] args) {
		
		Room r = new Room(5,6,"An Inconveniently Placed Room");
		Room exit = new Room(10, 10, "Outside");
		
		r.place(2, 5, new Door(exit));
		
		r.printRoom();
	}

}
