package AssignmentRandom;

public class NoofVowelsString {
	//java program to calculate number of vowel or consonant in string/arrays
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoOfVowelsAndConsonent();
	}
	static void NoOfVowelsAndConsonent() {
		String str="bhagyashri";
		int vovelcount=0;
		int consoncount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vovelcount++;
			}
			else {
				consoncount++;
			}
		}
		System.out.println("vowel count : "+vovelcount);
		System.out.println("consonent count: "+consoncount);
	}

}
