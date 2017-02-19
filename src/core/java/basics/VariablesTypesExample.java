package core.java.basics;

public class VariablesTypesExample {
	//class variable
	static int a=5;
	//instance variable
	int b=6;
	public static void main(String[] args) {
		//local variable
		int c=7;
		VariablesTypesExample ve= new VariablesTypesExample();
		
		System.out.println("c::"+c);
		System.out.println("b::"+ve.b);
		System.out.println("a::"+VariablesTypesExample.a);

	}

}
