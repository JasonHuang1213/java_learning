package assignment_42;
import java.util.*;

public class RollDice {

	public static void main(String[] args) {
		// Initialize Dice, Distribution and DistributionPrint objects
		Dice dice = new Dice();
		Distribution dis = new Distribution(1,6);
		DistributionPrint print = new DistributionPrint(dis);
		
		// Ask how many times the user wants to roll the dice
		int count;
		Scanner input = new Scanner(System.in);
		System.out.println("How many times do you want to roll the dice: ");
		count = input.nextInt();
		
		// Roll the dice
		for(int i=0; i<count; i++) {
			int number;
			dice.roll();
			number = dice.getScore();
			dis.insertValue(number);
		}
		
		print.disPrint();
		
		input.close();
	}

}
