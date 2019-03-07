
import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {

		int i, input = 0, sum = 0;

		Scanner s = new Scanner(System.in);

		int[] myArray = new int[5];

		for (i = 1; i <= 5; i++) {

			// succeeding processes
			System.out.println("Enter Element " + i + " :");
			input = s.nextInt();
			myArray[i - 1] = input;

		}

		String toString = "";
		String toString2 = "";

		for (i = 0; i < 5; i++) {

			toString = toString + myArray[i];
		}

		System.out.println("First to Last : " + toString);

		for (i = 4; i >= 0; i--) {

			toString2 = toString2 + myArray[i];
		}

		System.out.println("Last to First " + toString2);

	}
}
