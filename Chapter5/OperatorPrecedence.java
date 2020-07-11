public class OperatorPrecedence{
	public static void main(String[] args){
		int number1 = 5 + 5 * 2 - 1;
		/*
		* number == 14, because *-operator precedence is stronger than + and - operators.
		* + and - -operators have the same precedence, 
		* therefore they are handled from left to right.
		* Using parenthesis would clarify the statement: int number = 5 + (5 * 2) - 1;
		*/
		boolean result = 1 < 2 && 3 < 2;
		/*
		* result == false, because 1 < 2 == true and 3 < 2 == false
		* <-operator precedence is stronger than &&-operator
		* statement with the clarifying parenthesis: boolean result = (1 < 2) && (3 < 2);
		*/
		double number2 = (3 + 2.0) / 2 - 2;
		/*
		* number == 0.5, because of parenthesis 3 + 2.0 is calculated first,
		* after which the division and finally subtraction
		*/
		System.out.println("number1 is " + number1);
		System.out.println("result is " + result);
		System.out.println("number2 is " + number2);
	}
}
