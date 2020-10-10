package assignment_31;
import java.util.*;

public class Assignment_31 {

	public static void main(String[] args) {
		// Create an arraylist called dates
		ArrayList<Date> dates = new ArrayList<Date>();
		Scanner input = new Scanner(System.in);
		
		// Ask user input until input is empty
		while(true) {
			System.out.println("Give a date in dd.mm.yyyy format to be compared with dates above: ");
			String date = input.nextLine();
			
			if(date.equals("")) break;	// detect ENTER key pressed
			dates.add(new Date(date));
		}

		// Print out all dates
		System.out.println("All the dates:");
		for(Date d : dates) {
			System.out.println(d);
		}
		
		// Ask a year from user and print out dates that have this year
		int askedYear;
		System.out.println("Give a year that is included in dates array list: ");
		askedYear = input.nextInt();
		
		System.out.println("All the dates that have year " + askedYear + " :");
		for(int i=0; i<dates.size(); i++) {
			if(dates.get(i).getYear() == askedYear)
				System.out.print(dates.get(i) + " ");
		}
		
		// The user gives a date and program output the index of the date of "not found"
		String dateStr;
		System.out.println("\nGive a date included in the dates array list: ");
		input.nextLine();	// Read the line break
		dateStr = input.nextLine();
		Date givenDate = new Date(dateStr);
		int counter = 0;
		
		System.out.println("Index of dates: ");
		for(int i=0; i<dates.size(); i++) {
			if(givenDate.isSame(dates.get(i))) { // compare two Date objects
				System.out.println(i);
				counter++;
			}
		}
		// If no date is found, print "not found"
		if(counter == 0) {
			System.out.println("Not found");
		}
		
		input.close();
	}

}
