package AssignmentsWithScanner;

import java.util.Scanner;

public class LargeElementArray{

	public static void main(String[] args) {
		int n;
		SmallestElementArray obj0=new SmallestElementArray();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter No of elements in array :");
		n=obj.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements in array :");
		for(int i=0;i<n;i++) {
			arr[i]=obj.nextInt();
		}
		
		System.out.println("print array elements: ");
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		System.out.print("larger element in array: ");
		LargeElementArray.FindLargeElement(arr);
	}
static void FindLargeElement(int arr[]) {
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println("Greatest Element in array: "+max);
}
}
