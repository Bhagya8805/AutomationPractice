package LogicalAssignment;

public class MonthAndDays {
/*Write a program to convert given no. of days into months and days. (Assume that each month is of 30 days)
	Example :Input - 69 Output - 69 days = 2 Month and 9 days*/
	public static void main(String[] args) {
		int number=69;
		int month,days;
		month=number/30;
		
		days=number%30;
		System.out.println(month+" months and "+days+" days");
		
		
	}

}
