package labwork;

public class MainApplication {

	public static void main(String[] args) {
		Car c = new Car("Car", 4, "JAGUAR" , 5);
		c.move();
		c.brake();
		Train t = new Train("Train", "R Express", 80 , 800, 10);
		t.move();
		t.brake();
		Boat b = new Boat("Boat", 0, "ST" ,10 , 2);
		b.move();
		b.brake();
		
	}
}