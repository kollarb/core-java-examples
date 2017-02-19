package core.java.basics;

public class DecisionMakingExample {

	public static void main(String[] args) {
		int a=5,b=6;
		boolean result=true;

		//if else
		if(result){
			System.out.println("inside if");
		}else{
			System.out.println("inside else");
		}

		//conditional operator
		System.out.println("conditional operator check::"+(a==5?"true":"false"));

		//switch case
		switch(b){
		case 5:{
			System.out.println("inside case 5");
			break;
		}
		case 6:{
			System.out.println("inside case 6");
			break;
		}
		default:{
			System.out.println("inside case default");
			break;
		}
		}
	}

}
