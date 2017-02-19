package core.java.basics;

public class ModifierTest {

/*
 * cannot access private modifier
 * uncomment the 3rd sysout you will get compilation error
 */
	public static void main(String[] args) {
		Modifiers m= new Modifiers();
		System.out.println("public modifier::"+m.a);
		System.out.println("protected modifier::"+m.b);
		//System.out.println("private modifier::"+m.c);
		m.print();
	}

}
