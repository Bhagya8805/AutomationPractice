package ArrayAssignments;
//largest and smallest element
public class MinAndMax {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {10,45,1,45,78,2};
		int min=arr[0];
		for (int i=0;i<arr.length;i++) {
			
			if(min>arr[i]){
				min=arr[i];
			}
			
		}
		System.out.println("Min number in array is: "+min);
		int max=arr[0];
	for (int i=0;i<arr.length;i++) {
			
			if(max<arr[i]){
				max=arr[i];
			}
			
		}
	System.out.println("Max number in array is: "+max);
	}

}
