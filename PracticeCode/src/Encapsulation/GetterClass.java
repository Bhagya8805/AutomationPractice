package Encapsulation;

public class GetterClass {
private int pincode=413251;
private char grade='A';
public int getPincode() {
	return pincode;
}
public char getGrade() {
	return grade;
}


//this is read only class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterClass obj=new GetterClass();
		System.out.println(obj.getPincode());
		 System.out.println(obj.getGrade());
	}

}
