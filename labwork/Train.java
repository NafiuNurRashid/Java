package labwork;

public class Train extends Vehicles {

	int numberOfBogies;

	public Train(String type, String name,int numberOfWheels, int numberOfSeats, int numberOfBogies) {
		super(type, numberOfWheels, name, numberOfSeats);

		this.numberOfBogies = numberOfBogies;
		System.out.print("\nThis vehicle has " +numberOfBogies+ " bogies.");
		System.out.print("It moves on track.");
		
	}

}