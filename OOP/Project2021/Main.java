import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Hashtable<Date,Expense> allExpenses = new Hashtable<>();
		ArrayList<Date> dates = new ArrayList<>();
		ArrayList<Expense> expenses = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int option;
		int count = 0;
		
		while(true) {
			System.out.print("Options: 1.Insert an expense \n\t 2.Show expense within one day \n\t 3.Calculate total sums of different categories \n\t 0.Quit\n");
			option = input.nextInt();
			if (option == 0) break;
			else if (option == 1) {
				// Insert an expense
				dates.add(new Date());
				expenses.add(new Expense());
				allExpenses.put(dates.get(count), expenses.get(count));
				count++;				
			}
			else if (option == 2) {
				// Show expense in a day
				Date date = new Date();
				for (Date d : dates) {
					if (d.getYear() == date.getYear() && d.getMonth() == date.getMonth() && d.getDay() == date.getDay()) {
						System.out.println(d.toString() + ": " + allExpenses.get(d).toString());
					}
				}
			}
			else if (option == 3) {
				// Calculate total sums of different categories
				
			}
		}
		
		
		input.close();
	}

}
