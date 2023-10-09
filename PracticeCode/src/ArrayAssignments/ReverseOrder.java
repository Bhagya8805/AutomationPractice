package ArrayAssignments;
//print elements
public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char arr[]=new char[] {'a','u','t','g','v'};
System.out.println("normal order");
for(int i=0;i<arr.length;i++) {

	System.out.print(arr[i]+ " :");

}
System.out.println();
System.out.println("reverse  order");
for(int i=arr.length-1;i>=0;i--) {
	
	System.out.print(arr[i]+ " :");
}
	}

}
