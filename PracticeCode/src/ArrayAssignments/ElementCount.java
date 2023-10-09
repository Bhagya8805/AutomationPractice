package ArrayAssignments;
//No of elements in an array
public class ElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {10,45,1,45,78,2};
		int count=0;
		for(int a:arr) {
			count++;
		}
		System.out.println(count);
	}

}
