package rk.selenium_automation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametrized_testing {
	
	    @Parameters({"num"})
	    @Test
	    public void display_num(int num) {
	        System.out.println("Number is: " + num);
}
}
