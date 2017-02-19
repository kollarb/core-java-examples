package core.java.basics;

public class LoopsExample {

	public static void main(String[] args) {
		int i;
		//for loop
		for (i=1;i<=5;i++){
			System.out.println("i::"+i);
		}
		//while loop
		while(i<=10){
			System.out.println("i::"+i);
			i++;
		}
		//do while loop
		do{
			System.out.println("i::"+i);
			i++;
		}while(i<=15);
	}

}
