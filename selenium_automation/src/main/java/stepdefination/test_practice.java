package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test_practice {
	    ChromeDriver driver;
	    @Given("practive form should launch")
	    public void launch() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/automation-practice-form");
	}
	@When("enter name,surname and email")
	public void insertdata() {
		driver.findElement(By.id("firstName")).sendKeys("Revan");
		
		driver.findElement(By.id("lastName")).sendKeys("Kole");
		driver.findElement(By.id("userEmail")).sendKeys("revankole@gmail.com");
		System.out.println("enter data sucessfully");

	}

	@Then("name,surname and email inserted sucessfully")
	public void verifydata() throws InterruptedException {
		System.out.println("verify data");
		Thread.sleep(5000);
		driver.quit();

}
	
}
