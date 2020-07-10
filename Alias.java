public class Alias {
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int[] alias;
		
		// alias refers to nothing
		alias = original;
		
		//alias and original refer to the same array
		//change the first element using the variable alias
		alias[0] += 10;


		//change the second element using the variable original
		original[1] += 10;
		System.out.println("original:");
		
		//print the array elements using original
		for (int i=0; i < original.length; i++)
			System.out.print(original[i] + " ");
		
		System.out.println();
		System.out.println("alias:");
		
		// print the array elements using alias
		for (int i=0; i < alias.length; ++i)
			System.out.print(alias[i] + " ");

		System.out.println();
	}
	
}