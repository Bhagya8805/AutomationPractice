package ArrayAssignments;

import java.util.Arrays;

//Sort ascending and descending order
public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {10,45,1,45,78,2};
		Arrays.sort(arr);
		
		for(int a:arr) {
			System.out.print(a+ " ");
		}
		System.out.println();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
