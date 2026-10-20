package rk.selenium_automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {
	@AfterTest
void name() {
	System.out.println("Revan");
}
	@Test
void email() {
	System.out.println("revankole@gmail.com");
}
	@BeforeTest
void surname() {
	System.out.println("Kole");
}
}
