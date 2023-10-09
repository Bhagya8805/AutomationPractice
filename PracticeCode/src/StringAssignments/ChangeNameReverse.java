package StringAssignments;

public class ChangeNameReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Name is James";
		String eachRev = "";

		String sarr[] = str.split(" ");
		for (int i=sarr.length-1; i>=0;i--)
		{
			eachRev = eachRev+ " "+sarr[i];
		}
		System.out.println(eachRev);


	}


}
