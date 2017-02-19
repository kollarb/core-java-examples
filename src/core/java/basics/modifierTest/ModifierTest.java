package core.java.basics.modifierTest;

import core.java.basics.Modifiers;

public class ModifierTest {
	/*
	 * cannot access protected and private modifier
	 * uncomment the 2nd and 3rd sysout you will get compilation error
	 */

	public static void main(String[] args) {
		Modifiers m= new Modifiers();
		System.out.println("public modifier::"+m.a);
		//System.out.println("protected modifier::"+m.b);
		//System.out.println("private modifier::"+m.c);
	}

}
