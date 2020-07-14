public class Concatenation {
    public static void main (String[] args) {
        String cs = "3";
        int integer = 3;
        
        System.out.println(cs + 3 + integer);
        System.out.println(3 + integer + cs);
        System.out.println(cs + integer + 3);
        System.out.println(cs + (3 + integer));
		System.out.println(integer + cs + 3);
		System.out.println("\"/\\/\\\"\n" + " \\/\\/");
    }
}