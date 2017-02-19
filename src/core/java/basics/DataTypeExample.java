package core.java.basics;

public class DataTypeExample {

	public static void main(String[] args) {
		int a=5;
		double b=6.5,d=7.056;
		char c='c';
		boolean value=true;

		System.out.println("a::"+a);
		System.out.println("b::"+b);
		System.out.println("c::"+c);
		System.out.println("value::"+value);

		//implicit type casting
		b=a;
		System.out.println("after type casting::"+b);

		//explicit type casting
		a=(int)d;
		System.out.println("after type casting::"+a);
	}

}
