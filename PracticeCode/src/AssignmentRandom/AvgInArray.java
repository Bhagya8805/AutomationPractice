package AssignmentRandom;

public class AvgInArray {
	//calculate average of numbers in arrays int arr[] = {34,44,56,17,13,12};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {34,44,56,17,13,12};
		 FindAvg(arr);

	}
	static void FindAvg(int arr[]) {
	int sum=0;
	double avg;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		avg=(sum/arr.length);
		System.out.println("Average of element in array : "+avg);
	}

}
