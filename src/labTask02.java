//program to insert an element into an array
import java.util.Arrays;
import java.util.Scanner;

public class labTask02 {

	public static void main(String[] args) {

		int n, pos, x;
		Scanner arr = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		n = arr.nextInt();
		int numbers[] = new int[n + 1];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			numbers[i] = arr.nextInt();
		}
		System.out.print("Enter the position to insert element: ");
		pos = arr.nextInt();
		System.out.print("Enter the element to insert: ");
		x = arr.nextInt();
		for (int i = (n - 1); i >= (pos - 1); i--) {
			numbers[i + 1] = numbers[i];
		}
		numbers[pos - 1] = x;
		System.out.print("The new array after inserting: ");
		for (int i = 0; i < n; i++) {
			System.out.print(numbers[i] + ",");
		}
		System.out.print(numbers[n]);

	}

}
