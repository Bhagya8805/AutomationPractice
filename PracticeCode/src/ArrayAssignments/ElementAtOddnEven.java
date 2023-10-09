package ArrayAssignments;
//Even and odd position element
public class ElementAtOddnEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[] {10,5,42,0,89,1};
System.out.println("Elemenet at even position");
for (int i=1;i<arr.length;i=i+2) {
System.out.println(arr[i]);
}
	
System.out.println("Elemenet at odd position");
for (int i=0;i<arr.length;i=i+2) {
System.out.println(arr[i]);
}}

}
