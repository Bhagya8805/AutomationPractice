package AssignmentRandom;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]= {10,4,8,41 };
	sortArray(arr);
	}
	static void sortArray(	int arr[]) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {	
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
			System.out.println(arr[i]);
		}
		
	}

}
