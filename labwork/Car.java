package labwork;

public class Car extends Vehicles{

	public Car(String type, int numberOfWheels, String name, int numberOfSeats) {
		super(type, numberOfWheels, name, numberOfSeats);
		System.out.print("It moves on road.");
	}

	

}