import java.util.Scanner;
public class Matrix {

    public static void main(String[] args) {
        int rows, columns;
		Scanner reader = new Scanner(System.in);
        
        System.out.print("Type in the number of rows: ");
        rows = reader.nextInt();
        System.out.print("Type in the number of columns: ");
        columns = reader.nextInt();

        int matrix [][];
		matrix = new int[rows][columns];

        matrix = askInfo(rows, columns);
        printMatrix(matrix);
        countSum(matrix);
    }
	//  Write the missing methods here
	//  Methods are written in the text box below.
	
	private static int[][] askInfo(int r, int c){
		Scanner input = new Scanner(System.in);
		int[][] m = new int[r][c];
		for (int i=0; i<r; i++){
			for (int j=0; j<c; j++){
				System.out.print("Type in the element "+ (j+1) +" of the row "+ (i+1) +": ");
				m[i][j] = input.nextInt();
			}
		}
		return m;
	}
	
	private static void printMatrix(int[][] matrix){
		System.out.println("Matrix:");
		for (int i=0; i<matrix.length; i++){			// matrix.length - row number
			for (int j=0; j<matrix[i].length; j++){		// matrix[i].length - column number
				System.out.print(matrix[i][j]+ "\t");
			}
			System.out.println();
		}
	}
	
	private static void countSum(int[][] matrix){
		int sum=0;
		for (int i=0; i<matrix.length; i++){
			for (int j=0; j<matrix[i].length; j++){
				sum += matrix[i][j];
			}
		}
		System.out.print("Sum of the elements of the matrix: " + sum);
	}
}