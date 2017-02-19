package core.java.basics;

public class ArraysExample {

	public static void main(String[] args) {
		//array
		int array[]={1,2,3,4,5};
		
		/*
		 * uncomment this you will see error
		 * since you are giving double value instead of int
		 */
		//int notArray[]={1,2,3,4,5.5};
		
		//for each loops
		for(int i: array){
			System.out.println(i);
		}

	}

}
