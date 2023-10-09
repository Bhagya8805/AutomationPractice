package StringAssignments;

public class RemoveSpace {
//How do you remove all white spaces from a string in java?
	//Write a java program to remove all white spaces from a given string.
	public static void main(String[] args) {
		String str="    India is my country.     ";
		System.out.println(str.trim());
		String op="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if (!Character.isWhitespace(ch)) {
                op += ch;
            }
		}
		System.out.print(op);
	}

}
