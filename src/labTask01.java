
//Program to find the max and min of an array
import java.util.Arrays;
import java.util.Scanner;

public class labTask01 {

	public static void main(String[] args) {

		Scanner arr = new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int n = arr.nextInt();
		int[] numbers = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			numbers[i] = arr.nextInt();
		}

		// int[] numbers = { 1, 2, 3, -4, 5, -7, 9, 7 };
		System.out.println("Array is: " + Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("Maximum value of this array is: " + numbers[numbers.length - 1]);
		System.out.println("Minimum value of this array is: " + numbers[0]);

	}

}
