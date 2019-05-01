import java.util.Scanner;


public class InputProgram {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	
	while(true){
		int input = scanner.nextInt();
		System.out.println(input);
		if(input==0)
			break;
	}

	}

}
