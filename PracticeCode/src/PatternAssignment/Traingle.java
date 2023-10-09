package PatternAssignment;

public class Traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeftTraingle();
	}
static void LeftTraingle() {
	for(int i=0;i<5;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
static void RightTraingle() {
	for(int i=0;i<5;i++) {
		for(int j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
