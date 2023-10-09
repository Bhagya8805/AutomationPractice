package StringAssignments;

public class FirstNonRepetedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="ateeter";
		char ch[]=str.toCharArray();
		for(char i :ch){
			if ( str.indexOf(i) == str.lastIndexOf(i)) {
				System.out.println("First non-repeating character is: "+i);
				break;
			}

		
		}
	}

}
