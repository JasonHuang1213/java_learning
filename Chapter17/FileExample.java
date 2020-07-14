import java.io.*;
import java.util.Scanner;
public class FileExample {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("story.txt"));
		String row;
		while(file.hasNextLine()) {
			row = file.nextLine();
			System.out.println(">>>" + row + "<<<");
		}
		file.close();
	}
}
