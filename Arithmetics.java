/*
* calculations with numeral primitive data types int and double
*/
public class Arithmetics {
    public static void main(String[] args) {
         int iNumber1 = 4 + 5;
         int iNumber2 = 2 * 6;
         double dNumber1 = 3.3;
         double dNumber2 = dNumber1 * iNumber1;
         System.out.println(iNumber1);
         System.out.println(iNumber2);
         System.out.println(dNumber1);
         System.out.println(dNumber2);
         System.out.println("- - -");
         System.out.println(iNumber2 / iNumber1);	// int / int = int
         System.out.println(iNumber2 / iNumber1 * 1.0);	// int * double = double
         System.out.println(1.0 * iNumber2 / iNumber1);	
         System.out.println("- - -");
         System.out.println(iNumber1 + iNumber2 / dNumber1 * dNumber2);
   }
}