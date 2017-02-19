package core.java.basics;

import java.util.Scanner;

//class
public class ObjectExample {
	
	public static void main(String[] args) {
		//object
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter value for i::");
		//variable
		int i= scan.nextInt();
		System.out.println("Enter value for j::");
		//variable
		int j= scan.nextInt();
		
		//object
		ObjectExample oe= new ObjectExample();
		int result=oe.sum(i,j);
		System.out.println("sum::"+result);
	}

	//method
	private int sum(int i, int j) {
		return i+j;
	}

}
