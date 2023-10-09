package Assignments;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c1=new Constructor();
		Constructor c2=new Constructor(10);
		Constructor c3=new Constructor('s');
	}
	Constructor(){
		System.out.println("this is a costrctor");
	}
	
	Constructor(int x){
		System.out.println("this is  int paramaeter a costrctor "+x);
	}
	Constructor(char a){
		System.out.println("this is  char paramaeter a costrctor :"+a);
	}
}
