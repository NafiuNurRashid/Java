//program to find the average of an array elements.
import java.util.Arrays;
import java.util.Scanner;

public class labTask03 {

	public static void main(String[] args) {
		double average, total = 0;
		Scanner arr = new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int n = arr.nextInt();
		int[] numbers = new int[n];
		System.out.println("Enter the elements:");

		for (int i = 0; i < n; i++) {
			numbers[i] = arr.nextInt();
			total = total + numbers[i];
		}

		average = total / n;
		System.out.println("Average is: " + average);
	}

}
