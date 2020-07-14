public class Cmd {
    public static void main (String[] args) {
		int sum;
		
		System.out.println(args[0]);
		
		//convert args[0] String to char
		char[] charArray = args[0].toCharArray();
		for(int i=0; i<charArray.length; i++)
			System.out.println(charArray[i]);
		
    }
}