package ArrayAssignments;

import java.util.Arrays;

public class DuplicteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {10,20,10,30,20,40};
		Arrays.sort(arr);
		DuplicteElement.countFrequency(arr, arr.length);
	}
	static void countFrequency(int[] arr, int n)
	{

		for (int i = 0; i < n; i++)
		{
			int count = 1;

			// Move the index ahead whenever
			// you encounter duplicates
			while (i < n - 1 && arr[i] == arr[i + 1]) {
				i++;
				count++;
				if(count==2)
				{
					System.out.println(arr[i] + ":duplicate elements ");

				}
			}



			count++;
		}
	}
}
