package Assignments;

public class ThisKeyword {
	 
		int accNum=12345;
		
		public static void main(String[] args) {
			
			ThisKeyword p1=new ThisKeyword();
			System.out.println(p1.accNum);
		
		}
	}
	class AccessThisKeyword {

		public static void main(String[] args) {
			
			ThisKeyword p1=new ThisKeyword();
			System.out.println("Accessing Default members from child class");
			System.out.println(p1.accNum);
		
		}
	}



