package ArrayAssignments;

public class SortArray {

	public static void main(String[] args) {

		int arr[]=new int[] {1,5,8,2,7};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int temp=0;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
		
		}
		for(int b:arr) {
			System.out.print(b+" ");
		
		}
		System.out.println();
		System.out.println(arr[n-1]);

	}

}
