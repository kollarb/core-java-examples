package core.java.basics;

public class StringExample {

	public static void main(String[] args) {
		String firstName="Bharath";
		String lastName="Kollareddy";
		String secondName= new String ("Bharath");

		final String regex="[A-Z][a-zA-Z]{1,10}";

		//adding 2 strings
		System.out.println("full name"+firstName.concat(lastName));

		/*
		 * .equals vs ==
		 * .equals compares memory address as well
		 */
		System.out.println("==::"+firstName==secondName);
		System.out.println(".equals::"+firstName.equals(secondName));

		//regular expression example
		System.out.println("Regex compare::"+firstName.matches(regex));

		//String Buffer example
		StringBuffer strBuffer= new StringBuffer(" ");
		for(int i=1;i<=5;i++){
			strBuffer.append(i);
		}
		System.out.println("finalResult="+strBuffer.toString());
	}

}
