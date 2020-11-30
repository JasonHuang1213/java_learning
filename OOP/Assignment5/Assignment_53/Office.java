package assignment_53;
import java.util.*;

public class Office extends Room{

	private ArrayList<String> staffs = new ArrayList<>();
	
	public Office(String number, String description) {
		super(number, description);
		// TODO Auto-generated constructor stub
	}
	
	public Office() {
		super("", "");
	}
	
	// Ask data from users
	public void askInfo() {
		super.askInfo();
		Scanner input = new Scanner(System.in);
		String name = "";
		do {
			System.out.println("The name of the staff(0 to terminate): ");
			name = input.nextLine();
			if (name.equals("0")) break;
			staffs.add(name);
		} while(true);
		
	}


	@Override
	public String toString() {
		String staffMembers = "";
		for( String s : staffs) {
			staffMembers = staffMembers + s + " ";
		}
		return super.getNumber() + ": " + super.getDescription() + ", " + "staff members " + staffMembers;
	}
	
	// whether a staff member is in this Office
	public boolean isInThisOffice(String name) {

		for ( String n : staffs) {
			if (name.equalsIgnoreCase(n)) return true;
		}
		return false;
	}
	
}
