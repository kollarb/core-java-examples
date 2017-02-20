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
		
		/*
		 * index starts with 0
		 * uncomment and execute this again you will get an Exception
		 */
		try{
		System.out.println(array[5]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("cannot access array element. Please check the size::"+ array.length);
		}

	}

}
