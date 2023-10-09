package ArrayAssignments;

public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,23,5,89,4};
		int n=2;
	
		System.out.println("array before shifting");
for(int a:arr) {
	System.out.print(a+" ");
}
System.out.println();

for(int i=0;i<n;i++) {
	int first,j;
	first=arr[0];

	for( j=0;j<arr.length-1;j++) {
		arr[j]=arr[j+1];
	}
	arr[j]=first;;
	
}
System.out.println("array after shifting");
for(int a:arr) {
System.out.print(a+" ");
}
System.out.println();

	}
	
	
	}
