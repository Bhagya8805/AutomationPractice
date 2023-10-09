package TestPractice;

import org.testng.annotations.Test;

public class Example3 {
@Test(priority=-1,timeOut=2000)

public void testCase1() {
	System.out.println("This is TC1");
}
@Test(priority=-2)

public void testCase2() {
	System.out.println("This is TC2");
}
@Test(enabled=false)

public void testCase3() {
	System.out.println("This is TC3");
}
}
