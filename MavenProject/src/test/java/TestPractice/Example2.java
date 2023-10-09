package TestPractice;

import org.testng.annotations.Test;

public class Example2 {
@Test(priority=1)

public void testCase1() {
	System.out.println("This is TC1");
}
@Test(priority=3)

public void testCase2() {
	System.out.println("This is TC2");
}
@Test(enabled=false)

public void testCase3() {
	System.out.println("This is TC3");
}
}
