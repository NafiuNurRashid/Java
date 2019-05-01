
public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational r1 = new Rational (5,7);
		Rational r2 = new Rational (2,3);
		Rational result=r1.add(r2);
		System.out.println(r1.toString()+"+" + r2.toString()+ "=" +result.toString());

		Rational result1=r1.Subtract(r2);
		System.out.println(r1.toString()+"-" + r2.toString()+ "=" +result1.toString());

		Rational result2=r1.Multiplication(r2);
		System.out.println(r1.toString()+"*" + r2.toString()+ "=" +result2.toString());
		
		Rational result3=r1.Division(r2);
		System.out.println(r1.toString()+"/" + r2.toString()+ "=" +result3.toString());
	}

}
