import java.util.*;

public class Assignment_62 {

	public static void main(String[] args) {
		ArrayList<Date> dates = new ArrayList<>();
		String str;
		Scanner input = new Scanner(System.in);
		
		dates.add(new Date(11,11,2011));
		dates.add(new Date(12,20,2011));
		dates.add(new Date(8,5,1994));
		dates.add(new Date(20,1,2030));
		dates.add(new Date(30,3,2050));
		
		System.out.println("All dates before sorting: ");
		for (Date d : dates) {
			System.out.println(d.toString());
		}

		Collections.sort(dates);
		
		System.out.println("\nAll dates after sorting: ");
		for (Date d : dates) {
			System.out.println(d.toString());
		}
		
		System.out.println("\nEnter a date(dd.mm.yyyy): ");
		str = input.nextLine();
		Date date = new Date(str);
		System.out.println("\nAll dates after the given date: ");
		for (Date d : dates) {
			if (d.compareTo(date) > 0) {
				System.out.println(d.toString());
			}
		}
		input.close();
	}
	

}
