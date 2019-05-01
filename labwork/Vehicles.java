package labwork;

public class Vehicles {

	String type;
	int numberOfWheels;
	String name;
	int numberOfSeats;
	
	public Vehicles(String type,int numberOfWheels, String name, int numberOfSeats) {
		super();
		this.type = type;
		this.numberOfWheels = numberOfWheels;
		this.name = name;
		this.numberOfSeats = numberOfSeats;
	}

	
	
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getNumberOfWheels() {
		return numberOfWheels;
	}



	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getNumberOfSeats() {
		return numberOfSeats;
	}



	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}



	protected void move() {
		System.out.print("This is a " +this.type+ ". Its name is " +this.name+ ". It has " +this.numberOfWheels+ " wheels and " 
	+this.numberOfSeats+ " seats.");
	}

	protected void brake() {
		System.out.println(name+ " brakes.");
	}
}