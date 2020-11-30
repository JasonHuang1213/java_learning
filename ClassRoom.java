package assignment_53;
import java.util.*;

public class ClassRoom extends Room{
	
	private int numberOfSeats;
	private int numberOfComputers;
	private boolean dataProjector;
	
	public ClassRoom(String number, String description, int numberOfSeats, int numberOfComputers,
			boolean dataProjector) {
		super(number, description);
		this.numberOfSeats = numberOfSeats;
		this.numberOfComputers = numberOfComputers;
		this.dataProjector = dataProjector;
	}
	
	public ClassRoom() {
		super("", "");
	}

	public void askInfo() {
		super.askInfo();
		Scanner input = new Scanner(System.in);
		System.out.println("What is the number of seats: ");
		numberOfSeats = input.nextInt();
		System.out.println("What is the number of computers: ");
		numberOfComputers = input.nextInt();
		System.out.println("Is there any data projectors(true or false): ");
		dataProjector = input.nextBoolean();

	}

	@Override
	public String toString() {
		String projector = dataProjector ? "data projector" : "no data projector";
		
		return super.getNumber() + ": " + super.getDescription() + ", " + "seats " + numberOfSeats + 
				", " + "computers " + numberOfComputers + ", " + projector;
	}
	
}
