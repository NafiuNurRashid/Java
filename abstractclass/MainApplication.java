package abstractclass;

public class MainApplication {

	private static final String Perimeter = null;

	public static void main(String[] args) {
		
		Shape s = new Square(5);
		double area = s.getArea();
		double perimeter = s.getPerimeter();
		
		System.out.println("Area= " +area);
		System.out.println("Perimeter = " +perimeter);
		
		Shape t = new Triangle(4, 5);
		double triangle = t.getArea();
		double peri = t.getPerimeter();
		System.out.println("Triangle= " +triangle);
		System.out.println("Triangle PErimeter= " +peri);
		
		Shape p = new Rectangle(6,7);
		double rectangle = p.getArea();
		double per = p.getPerimeter();
		System.out.println("Rectangle= " +rectangle);
		System.out.println("Rectangle PErimeter= " +per);
		
		

	}

}
