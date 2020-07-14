import java.io.*;
import java.util.Scanner;
public class WriteExample2{
	public static void main(String[] args){
		
		String file = "stories.txt";
		
		Scanner reader = new Scanner(System.in);
		
		PrintWriter writer = null;
		boolean end = false;
		
		try{
			writer = new PrintWriter(new FileOutputStream(file, true));
		}catch(Exception e){
			System.out.println("File "+file+" could not be opened for reading!");
			return ;	// exit program
		}
		
		System.out.println("Program writes input to file \"" +
			file + "\"");
		System.out.println("QUit by typing the string \"!end\"");
		String row = "";
		
		while(!end){
			row = reader.nextLine();
			if(row.equalsIgnoreCase("!end")){
				end = true;
			}else{
				writer.println(row);
			}
		}
		
		writer.close();
	}
}