package rk.selenium_automation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotation_method {
	@BeforeMethod
	void name() {
		System.out.println("Revan");
	}
	@Test
	void email() {
		System.out.println("revankole@gmail.com");
	}
	@AfterMethod
	void surname() {
		System.out.println("Kole");
	}

}
