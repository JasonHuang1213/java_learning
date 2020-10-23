package assignment_42;
import java.util.*;

public class Grade {

	public static void main(String[] args) {

		int grade = 0;
		Scanner input = new Scanner(System.in);
		// Initialize Distribution object dis
		Distribution dis = new Distribution(0,5);
		DistributionPrint print = new DistributionPrint(dis);
		
		
		// Ask grades from user
		while(true) {
			System.out.println("Enter a grade(0-5)(-1 for exit): ");
			grade = input.nextInt();
			if(grade == -1) break;
			else dis.insertValue(grade);	
		}
		
		print.disPrint();
		input.close();
	}

}
