package abstractclass;

public abstract class Shape {
	public abstract double getArea();
	public abstract double getPerimeter();
	
	
}

class Square extends Shape{

	int side;
	
	public Square(int side){
		this.side = side;
	}
	@Override
	public double getArea() {
		return side*side;
	}
	@Override
	public double getPerimeter() {
		return 4*this.side;
	}
	
	
	
	
}