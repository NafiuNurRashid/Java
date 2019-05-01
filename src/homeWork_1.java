import static java.lang.Math.E;
import static java.lang.Math.PI;

import java.util.Random;
public class homeWork_1 {

	public static void main(String[] args) {
		double a=56.34, b=6.58334, c=-34.4265;
		
		System.out.println("Math.E = " + E);
		System.out.println("Math.PI = " + PI);
		
		Random num = new Random();
		int number;
		for(int counter =1; counter<=10; counter++) {
			number= 1+num.nextInt(6);
			System.out.println(number);
		}
		
		double absoluteValue= Math.abs(c);
		System.out.println("The absolute value of " +c + " is: " +absoluteValue);
		
		double squareRoot = Math.sqrt(a);
		System.out.println("Square root of " +a + " is = " +squareRoot);
		
		double result = Math.pow(a, b);
		System.out.println("Answer = " + result);
		
		double root= Math.pow(a, 2)+Math.pow(b, 2);
		System.out.println("Square Root of "+ root + " is: "+ Math.sqrt(root));
		
		
		 a = Math.toRadians(a);
		 System.out.println("Math.tanh(" + a + ")=" + Math.tanh(a));
		
	}

}
