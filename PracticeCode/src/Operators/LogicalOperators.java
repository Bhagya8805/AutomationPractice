package Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=5,y=3,z=10;
if(x>=y && x>=z ) {
	System.out.println("x is greater no "+x);
}
else if(y>=x && y>=z ) {
	System.out.println("y is greater no "+y);
}
else if(z>=x && z>=y) {
	System.out.println("z is greater no "+z);
}

int year=2024;
if(year%4==0 || year%100==0 || year%400==0  ) {
	System.out.println("given year is leap  "+year);
}
else {
	System.out.println("not leap year");
}
	}
	

}
