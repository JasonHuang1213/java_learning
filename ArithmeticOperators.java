public class ArithmeticOperators {
    public static void main (String[] args) {
        int iNumber1 = 6;
        int iNumber2 = iNumber1 / 2;
        double dNumber1 = 3.5;
        double dNumber2 = dNumber1 * 2;
        System.out.println(iNumber1 + " * " + iNumber2 + " is " + iNumber1*iNumber2);
        iNumber1++; // Is the same as iNumber1 = iNumber1 + 1;
        iNumber2--; // Is the same as iNumber2 = iNumber2 - 1;
        System.out.println(iNumber1 + " % " + iNumber2 + " is " + iNumber1%iNumber2);
        System.out.println(iNumber1 + " / " + iNumber2 + " is " + iNumber1/iNumber2);
        System.out.println(dNumber1 + " / " + dNumber2 + " is " + dNumber1/dNumber2);
        double result = iNumber1 + iNumber2 * dNumber1;
        System.out.println(iNumber1 + " + " + iNumber2 + " * " + dNumber1 + " is " + result);
   }
}