package ArrayAssignments;

public class SumOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {10,45,1,45,78,2};
int sum=0;
for(int i=0;i<arr.length;i++) {
	sum=sum+arr[i];
}
System.out.println("sum of all element in array: "+sum);
	}

}
