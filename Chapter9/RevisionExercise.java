import java.util.*;

public class RevisionExercise {
    public static void main(String[] args) {
      
        int[] tempArray = new int[100];
        System.out.println("Type in numbers. Type zero to quit.");
        int amountOfNumbers = askInfo(tempArray);
        int[] realArray = new int[amountOfNumbers];
        copyInfo(realArray, tempArray);
      
        setArray(realArray);
        
        printArray(realArray);
    }	
	private static int askInfo(int[] arr){
		int amount=0;
		int temp;
		int i = 0;
		do{

			Scanner input = new Scanner(System.in);
			System.out.println((i+1) + ". number: ");
			temp = input.nextInt();
			if(temp == 0) 
				break;
			else 
				arr[i] = temp;
			i++;
			amount++;
		}while(i <= 100);
		return amount;
	}
	
	private static void copyInfo(int[] real, int[] temp){
		for(int i = 0; i < real.length; i++)
			real[i] = temp[i];
	}
	
	private static void setArray(int[] arr){
		int temp;
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
	}

	
    public static void printArray(int[] realArray ) {
        System.out.println("\nOrdered array: ");
        for(int i = 0; i < realArray .length; i++) {
            System.out.println(realArray [i]);
        }
    }
}