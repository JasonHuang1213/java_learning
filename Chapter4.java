/*
* Chapter4.java
* Made for Viope course, chapter four
* (c) Viope Solutions Oy
*/
public class Chapter4 {
	public static void main(String[] args) {
		// define the named constant using key word final
		final String programmingLanguage = "Java";
		int cats = 4,
		    dogs = 1,
		    horses = 3;
		char multiply = '*';
		float fNumber = 4.321f;
		int iNumber = 3;
		// first additions, then concatenations
		System.out.println("Total animals " + (cats + dogs + horses) + " animals,");
		// We want decimals in the percent; multiply dogs variable with a double one
		System.out.println("of which dogs " + (dogs*1.0/(cats+dogs+horses)*100) + " %:s");
		//                                         ^^^
		/* char type is an integer type. Therefore multiplications character would not be printed as a character without the spaces (see below) */
		System.out.println(fNumber + " " + multiply + " " + iNumber + " is " + (fNumber*iNumber));
		//                           ^^^              ^^^
		// final encouragement
		System.out.println(programmingLanguage + "-programming is fun!");
		System.out.println(programmingLanguage + "is one of the most popular programming languages.");
	}
}
