import java.io.*;
public class FileRead {
	public static void main(String[] args) throws IOException {	// If IOException occurs
		String fileName = "story.txt";							// program crashes and info
		String readRow = null;									// will be printed.
		boolean rowsLeft = true;
		// create a FileReader object
		// create a BufferedReader object (the needed stream to the file)
		FileReader file = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(file);
		// file reading
		// read rows until readLine() method returns null
		while (rowsLeft) {
			readRow = reader.readLine();
			if (readRow == null) {
				rowsLeft = false;
				System.out.println("FILE END!");
			} else {
				System.out.println(">>>" + readRow + "<<<");
			}
		}
		// Stream is no longer needed and is therefore closed
		reader.close();
	}
}