package abstractclass;

class Triangle extends Shape{
	
	int base, height;
	public Triangle(int base, int height){
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5*this.base*this.height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return  base*height ;
	}
	
}