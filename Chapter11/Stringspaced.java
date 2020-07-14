public class Stringspaced{
	public static void main(String[] args){
		String str;
		str = "Iloveyou";
		System.out.println("Initial string: "+str);
		
		//convert string object to array object
		char[] strArr = str.toCharArray();
		
		
		//Print the array elements separated by spaces
		for(int i=0; i<strArr.length; i++)
			System.out.print(strArr[i]+" ");
		
	}
}