package Assignments;

public class Switch {

	public static void main(String[] args) {
		
		  int  a = 10, b=20;
char ch='s';
	     switch (ch) {
		case 'a': {
			System.out.println("addition= "+ (a+b));
			break;
		}
		case 's': {
			System.out.println("subtraction= "+ (a-b));
			break;
		}
		case 'm': {
			System.out.println("multiplication= "+ (a*b));
			break;
		}
		case 'd': {
			System.out.println("division= "+ (a/b));
			break;
		}
		default:
			System.out.println("noneof the above");
		}
	    
	
	     
	}
}