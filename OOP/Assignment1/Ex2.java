package exercise;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int num1, num2;
		System.out.println("Enter two integers and print the bigger one: \n");
		System.out.println("First integer: ");
		num1 = input.nextInt();
		System.out.println("Second integer: ");
		num2 = input.nextInt();
		if(num1 > num2)
			System.out.println(num1);
		else
			System.out.println(num2);
	}
}