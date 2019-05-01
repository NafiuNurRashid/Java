package ulab;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Point p1 = new Point(1,2);
		p1.getPoint();

		ColoredPoint cp = new ColoredPoint(2,3, "Red");
		cp.getPoint();
		*/
		
		Point point = new ColoredPoint(4,4, "Red");
		point.getPoint();
		System.out.println(point.toString());
		
		
	}

}
