package Practice;

public class RemoveSpace {

	public static void main(String[] args) {
		removeSpace("abc avc");

	}
	static void removeSpace(String str) {
		str=str.replaceAll("\\s", "");
		System.out.println(str);
	}

}
