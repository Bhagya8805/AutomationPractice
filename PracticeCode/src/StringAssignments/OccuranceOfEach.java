package StringAssignments;

public class OccuranceOfEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java";
		int totallength=str.length();
		int afterremove=str.replace("j","").length();
		int OccuranceOfEach=totallength-afterremove;
		System.out.println("Occurance of character is: "+OccuranceOfEach);
	}
}
