package assignment_53;
import java.util.*;

public class Room {
	private String number;
	private String description;
	
	public Room(String number, String description) {
		this.number = number;
		this.description = description;
	}
	
	public Room() {
		this.number = "";
		this.description = "";
	}
	
	public String getNumber() {
		return number;
	}

	public String getDescription() {
		return description;
	}


	// Ask number and description from users
	public void askInfo() {
		System.out.println("What is the room number: ");
		Scanner input = new Scanner(System.in);
		number = input.nextLine();
		System.out.println("What is the room description: ");
		description = input.nextLine();
		
	}

	@Override
	public String toString() {
		return number + ": " + description;
	}
	
}
