package labwork;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.omg.CORBA.DynAnyPackage.TypeMismatch;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter X: ");
			int x = scanner.nextInt();
			System.out.print("Enter Y: ");
			int y = scanner.nextInt();
			double result = 0.0;
			result = x / y;
			System.out.println("Result: " + result);

			// int size = scanner.nextInt();
			/*
			 * int [] array = new int[size]; int position = scanner.nextInt();
			 */
			// System.out.println(array[position]);
			int size = 5;
			System.out.print("Give array size: ");

			size = scanner.nextInt();
			int[] array = new int[size];
			int c[] = { 1 };
			c[40] = 100;
		} catch (NegativeArraySizeException e) {
			System.err.println(e.toString());

			// negative
			System.err.println("Wrong input negative number");
			int[] array = new int[10];
		}

		catch (InputMismatchException e) {
			// negative
			System.err.println(e.toString());
			System.err.println("Input must be an integer.");
			int[] array = new int[10];
		}

		catch (ArithmeticException e) {

			System.err.println(e.toString());
			System.err.println("Arrithmetic expression.");
			int[] array = new int[10];
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.err.println(e.toString());
			System.err.println("Array Index Out Of Bounds Exception");
			int[] array = new int[10];
		}

		finally {

			System.out.println("Exceptions  are taken care of.");

		}
	}
}
