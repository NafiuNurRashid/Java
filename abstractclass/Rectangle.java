package abstractclass;

class Rectangle extends Shape{

	int height, width;
	public Rectangle(int height, int width){
		this.height = height;
		this.width = width;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(height+width);
	}
	
}


