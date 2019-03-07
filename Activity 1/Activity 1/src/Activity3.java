import java.util.Scanner;

public class Activity3 {

	// Method for finding sum
	public static int findSum(int array[]) {

		int sum3 = 0;

		// checks the user input stored in myArray
		for (int i = 0; i < array.length; i++) {
			// code for adding the elements stored in myArray then stores it to sum3
			// variable
			sum3 = array[i] + sum3;
		}
		// returns the calculated value stored in sum3 to the user
		return sum3;

	}

	// Method for finding mean
	public static int findMean(int array[]) {
		int sum2 = 0;
		int average = 0;

		// user input dependent
		int length = array.length;

		// checks the user input stored in myArray
		for (int j = 0; j < length; j++) {
			sum2 += array[j];

			// formula/code for finding the mean
			average = sum2 / length;

		}
		return average;
	}

	// Method for finding mode
	public static int findMode(int array[]) {
		int max = 0;
		int maxCount = 0;
		int length = array.length;

		// code to check how many same numbers are present in the Array
		for (int i = 0; i < length; ++i) {
			int count = 0;
			for (int j = 0; j < length; ++j) {
				if (array[j] == array[i])
					++count;
			}
			if (count > maxCount) {
				maxCount = count;
				max = array[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int i, input = 0, sum = 0;

		Scanner s = new Scanner(System.in);
		// user desired capacity
		System.out.println("Enter number of elements :");
		int numberElements = s.nextInt();

		int[] myArray = new int[numberElements];

		System.out.println("Enter an Integer");

		for (i = 1; i <= myArray.length; i++) {

			// succeeding processes
			System.out.println("Enter Element " + i + " :");
			input = s.nextInt();
			myArray[i - 1] = input;

		}
		// calling methods for final output SOP
		int mean = Activity3.findMean(myArray);
		System.out.println("Mean= " + mean);
		int mode = Activity3.findMode(myArray);
		System.out.println("Mode= " + mode);
		int sum3 = Activity3.findSum(myArray);
		System.out.println("Sum= " + sum3);
	}

}
