package Constructor;

public class ParameterizedCons {
	int id;
double salary;
ParameterizedCons(int no,double pay){
	id=no;
	salary=pay;

}
void display() {
	System.out.println(id + " " + salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedCons obj=new ParameterizedCons(12,25465);
		obj.display();
	}

}
