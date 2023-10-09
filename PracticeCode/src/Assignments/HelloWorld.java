package Assignments;

public class HelloWorld {
static int z=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count = 0, num = 123456;

		   /* for (; num != 0; num /= 10, ++count) {
	
}
System.out.println(count);*/
		 while(num!=0) {
			 num=num/10;
			 count++;
		 }
		 System.out.println(count);
	}

}
