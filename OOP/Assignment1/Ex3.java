package exercise;
import java.util.*;

public class Ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("How many strings you want to give: ");
		num = input.nextInt();
		String[] str = new String[num];
		input.nextLine();
		for(int i=0; i< num; i++) {
			System.out.println("String" + (i+1) + " : ");
			str[i] = input.nextLine();
		}
		System.out.println("Strings you entered: \n");
		for(int i=0; i< num; i++) {
			System.out.println(str[i]);
		}
	}
}