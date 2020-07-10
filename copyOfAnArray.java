import java.lang.*;

public class copyOfAnArray {
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5};
		int[] copy = {0, 0, 0, 0, 0};
		System.arraycopy(original, 0, copy, 0, original.length);
		
		// change the copy
		for (int i=0; i < copy.length; ++i)
			copy[i] *= 2;

		System.out.println("original:");
		// print original
		for (int i=0; i < original.length; ++i)
			System.out.print(original[i] + " ");
		System.out.println();

		System.out.println("copy:");
		// print copy
		for (int i=0; i < copy.length; ++i)
			System.out.print(copy[i] + " ");
		System.out.println();
	}
}

