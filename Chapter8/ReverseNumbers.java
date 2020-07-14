import java.util.Scanner;
public class ReverseNumbers{
	private static void askNumber(double[] val){
		Scanner input = new Scanner(System.in);
		for(int i=0; i<val.length; i++){
			System.out.println("Type in " + (i+1) + ". number: ");
			val[i] = input.nextDouble();
		}
	}

	private static void reversePrinter(double[] val){
		for(int i=val.length - 1; i>=0; i--){
			System.out.println(val[i]);
		}
	}
	
	public static void main(String[] args){
		double[] val;
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("How many floating point numbers do you want to type: ");
		n = input.nextInt();
		
		val = new double[n];
		askNumber(val);

		System.out.println("Given numbers in reverse order: ");
		reversePrinter(val);
	}
}