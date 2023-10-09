package TestPractice;

import org.testng.annotations.Test;

public class Example4 {
@Test(priority=1,timeOut=2000)

public void testCase1() {
	System.out.println("This is TC1");
}
@Test(priority=3,invocationCount=5)

public void testCase2() {
	System.out.println("This is TC2");
}
@Test(enabled=true,expectedExceptions=ArithmeticException.class)

public void testCase3() {
	System.out.println("This is TC3");
	int i=10/0;
	System.out.println("throws expception");
}
}
