import java.io.*;
public class BufferedReading {
	public static void main(String[] args) throws IOException {

		// variable declarations
		BufferedReader keyboard, file;
		boolean rowsLeft = true;

		// create a stream object for reading from keyboard
		keyboard = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Type in name of the read file: ");
		String fileName = keyboard.readLine();

		System.out.print("Type in the max amount of read lines: ");
		String read = keyboard.readLine();

		// parse the integer from character string
		int maxLines = Integer.parseInt(read);

		// next in turn is the file ///////
		// create a stream object for reading from file
		file = new BufferedReader(new FileReader(fileName));

		read = null;
		int linesRead = 0;
		while(rowsLeft) {
			read = file.readLine();
			linesRead++;
			if (read != null && linesRead <= maxLines) {
				System.out.println(linesRead + ": " + read);
			} else {
				rowsLeft = false;
			}
		}

		// close the input stream from file
		file.close();
	}
}
