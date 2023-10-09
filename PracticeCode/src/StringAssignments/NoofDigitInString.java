package StringAssignments;

public class NoofDigitInString {
//15. Find the Count of numbers in the Given String "hey1234876hey"?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hey123487hey";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
	
			if(ch>='0' &&ch<='9') {
				count++;
			}
		}
		System.out.println("No og didgitd in given string sre: "+count);
	}

}
