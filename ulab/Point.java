package ulab;

public class Point {

	int x;
	int y;
	//String color;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;	
	}
	
	/*public Point (String color){
		this(0, 0);
		this.color = color;
	}
	
	public Point (){
		this.color = "Black";
	}*/

	
	protected void getPoint(){
		
		
		System.out.println("Calling from Point");
		System.out.println("("+this.x+", "+this.y+")");
	}

	@Override
	public  String toString() {
		// TODO Auto-generated method stub
		return "X=" +this.x+", Y="+this.y;
	}
	
	
	
	
	
}
