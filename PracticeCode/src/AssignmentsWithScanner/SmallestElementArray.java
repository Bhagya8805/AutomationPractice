package AssignmentsWithScanner;

import java.util.Scanner;

public class SmallestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		System.out.print("samllest element in array: ");
		obj0.SmallElement(arr);
	
	}
	void SmallElement(int arr[]) {
		int small=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(small>arr[i]) {
				small=arr[i];
			}
		}
		System.out.println(small);
	}

}
