package LogicalAssignment;

public class LargestElementArray {
//Write a program to find top two maximum numbers in the given array. You should not use any sorting functions. You
	//should iterate the array only once. You should not use any kind of collections in java.
	public static void main(String[] args) {
		int [] arr= {10,15,1,20};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println(arr[arr.length-1]);
	
	}

}
