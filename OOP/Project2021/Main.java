import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Hashtable<Date,Expense> allExpenses = new Hashtable<>();
		ArrayList<Date> dates = new ArrayList<>();
		ArrayList<Expense> expenses = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int option;
		int count = 0;
		
		while(true) {
			System.out.print("Options: 1.Insert an expense \n\t 2.Show expense within one day \n\t 3.Write to a file \n\t 4.Read from a file \n\t 0.Quit\n");
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
				// Write all expenses to a file expenses.text
				String result = "";
				for (Date d : allExpenses.keySet()) {
					result += d.toString() + ": " + allExpenses.get(d).toString() + "\n";
				}
				try {
					FileWriter fw = new FileWriter("expenses.txt");
					fw.write(result);
					System.out.println("All expenses have been successfully written to expenses.txt!");
					fw.close();
				} catch(Exception e) {
					System.out.println(e);
				}
			}
			else if (option == 4) {
				// Read expenses from a file expenses.txt
				FileReader fr = new FileReader("expenses.txt");
		        int i;    
		        while((i=fr.read())!=-1)    
		        	System.out.print((char)i);    
		        fr.close();    
			}
			System.out.println("=============================================================");
		}

		input.close();
	}

}
