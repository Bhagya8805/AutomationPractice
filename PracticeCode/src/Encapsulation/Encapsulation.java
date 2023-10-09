package Encapsulation;

public class Encapsulation {
	private int MobNo=123;
	private char div='A';
	
	public int getMobNo() {
		return MobNo;
	}
	public char getDiv() {
		return div;
	}
	public void setMobNo(int mobNo) {
		MobNo = mobNo;
	}
	public void setDiv(char div) {
		this.div = div;
	}
	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
		System.out.println(obj.MobNo);
		System.out.println(obj.div);
	}

}
