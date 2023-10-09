package ArrayAssignments;
//copy the array
public class CopyElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {10,20,30,40};
		int arr1[];
		arr1=arr.clone();
		for(int b: arr1) {
			System.out.println(b);
		}
	}

}
