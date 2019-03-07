import java.text.DecimalFormat;
import java.util.Scanner;

public class Prices {

	static double total, sumElements, average, sum, input;

	public static void main(String[] args) {

		int i, myCounter = 0;
		int j = 0, k = 0;

		DecimalFormat df = new DecimalFormat("00.00");

		Scanner s = new Scanner(System.in);

		double[] myArray = new double[20];

		for (i = 1; i <= 20; i++) {

			System.out.println("Enter Price " + i + " :");
			input = s.nextFloat();
			myArray[i - 1] = input;

		}

		for (i = 0; i < 20; i++) {

			total = myArray[i] + total;
		}

		System.out.println("Sum = " + total);

		average = total / myArray.length;
		System.out.println("Average = " + average);

		int counterFive = 0;

		for (i = 0; i < 20; i++) {
			if (myArray[i] < 5) {
				counterFive++;
			}
		}

		double[] lessFive = new double[counterFive];

		for (i = 0; i < counterFive; i++) {

			if (myArray[i] < 5) {
				lessFive[k] = myArray[i];
				k++;
			}
		}

		System.out.print("The values less than 5 are : ");

		for (i = 0; i < lessFive.length; i++) {
			System.out.print(" $" + df.format(lessFive[i]));
		}

		for (i = 0; i < 20; i++) {
			if (myArray[i] > average) {
				myCounter++;
			}
		}

		for (i = 0; i < 20; i++) {
			if (myArray[i] > average) {
				myCounter++;
			}
		}

		double[] higherAverage = new double[myCounter];

		for (i = 0; i < myCounter; i++) {

			if (myArray[i] > average) {
				higherAverage[j] = myArray[i];
				j++;
			}
		}

		System.out.println("");
		System.out.print("The values higher than the average are : ");

		for (i = 0; i < higherAverage.length / 2; i++) {
			System.out.print(" $" + df.format(higherAverage[i]));

		}

	}
}
