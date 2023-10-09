package ArrayAssignments;

public class LeftShift {

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
	int last,j;
	last=arr[arr.length-1];

	for( j=arr.length-1;j>0;j--) {
		arr[j]=arr[j-1];
	}
	arr[j]=last;;
	
}
System.out.println("array aftre shifting");
for(int a:arr) {
System.out.print(a+" ");
}
System.out.println();

	
	}

}
