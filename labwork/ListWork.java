package labwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class ListWork {

	public static void main(String[] args) {
		//LIST
		List<String> listOfString = new ArrayList<String>();
		listOfString.add("85948598458");
		listOfString.add("85948598458");
		listOfString.add("859467598458");
		listOfString.add("85458");
		listOfString.add("78578357");
		listOfString.add("38294589");	
		
		System.out.println(listOfString.contains("85458"));
		listOfString.remove(3);
		
		
		for(int i =0; i<listOfString.size(); i++){
			System.out.println(listOfString.get(i));
		}	
		
		
		//for each loop
		for(String x: listOfString){
			System.out.println(x);
		}
		
		
		
		
		//Stack
		Stack<String> demo = new Stack<String>();
		demo.push("89456789");
		demo.push("12456789");
		demo.pop();
		
		for(String x : demo){
			System.out.println(x);
		}	
		
		
		
		//TREE MAP
		Map<Integer, String> mymap = new TreeMap<Integer, String>();
		mymap.put(23456, "stfhd");
		mymap.put(12456, "uvw");
		mymap.put(45456, "hd");
		mymap.put(67456, "ioe");

		System.out.println(mymap);

		
		
		/*int [] integerArray= {1,2,3,4,5,6,};
		float [] floatArray= {1,2,3,4,5,6,};
		double [] doubleArray= {1,2,3,4,5,6,};
		
		print(integerArray);*/
	}	
		
	
	//no need to give
		public static <E> void print (E[] inputArray){
			for(E x : inputArray){
				System.out.println(x);
			}
		}
	

}