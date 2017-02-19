package core.java.basics;

public class BreakAndContinueExample {

	public static void main(String[] args) {
		int a=0;
		/*
		 * try commenting break and continue and see what happens
		 */
		while(a<5){
			a++;
			if(a==2){
				continue;
				//break;
			}
			System.out.println("a::"+a);	
		}
	}

}
