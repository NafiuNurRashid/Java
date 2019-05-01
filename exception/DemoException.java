package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.omg.CORBA.DynAnyPackage.TypeMismatch;

public class DemoException {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter X: ");
		//int x = scanner.nextInt();
		/*System.out.println("Enter Y: ");
		int y = scanner.nextInt();
		double result = 0.0; 
		result = x/y;
		*/
		
		//int size = scanner.nextInt();
		/*int [] array = new int[size];
		int position = scanner.nextInt();*/
		//System.out.println(array[position]);
		int size =5;
		System.out.print("Give array size: ");
		
		try{
			size = scanner.nextInt();
			int[] array = new int [size];
		} catch(NegativeArraySizeException e){
			System.err.println(e.toString());
			
			//negative
			System.err.print("Wrong input negative number");
			int[] array= new int [10];
		}
		
		catch(InputMismatchException e){
			//negative
			System.err.println(e.toString());
			System.err.println("Input must be an integer.");
			int[] array= new int [10];
		}
		
		
		
		
		System.out.println("Exceptions  are taken care of.");
		
	}

}
