import java.util.Scanner;


public class DimentionalArray2D {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//int [][] matrics = new int [4][4];
	//matrics[3][1] =5;
	
	
	int [][] matrics = {
			{1, 2, 3, 4},{5, 6, 7, 8}, {9,10,11,12}, {13,1,15,16}
	};
	/*
	for(int i = 0; i<3; i++){
		for(int j=0; j<5; j++){
			System.out.print(matrics[i][j]+ " ");
		}
		System.out.println();
	}
*/
	printDiagonal(matrics);
	
	
	}

	
	public static void printDiagonal(int [][] array){
		

		int i =0;
		int j=0;
		while(true){
			i++;
			j++;
		}
		
		
	/*	for(int i = 0; i<array.length; i++){
			for(int j=0; j<array.length; j++){
		if(i==j || i+j ==3)
			
			System.out.println(array[i][j]);	
				
			}
			System.out.println();
		
		
	}*/
	
	
	}
}

	
