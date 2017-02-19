package core.java.basics;

import java.util.Scanner;

public class ObjectExample {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter value for i::");
		int i= scan.nextInt();
		System.out.println("Enter value for j::");
		int j= scan.nextInt();
		ObjectExample oe= new ObjectExample();
		int result=oe.sum(i,j);
		System.out.println("sum::"+result);
	}

	private int sum(int i, int j) {
		return i+j;
	}

}
