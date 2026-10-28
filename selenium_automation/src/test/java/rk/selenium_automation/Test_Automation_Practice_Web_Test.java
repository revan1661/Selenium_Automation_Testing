package rk.selenium_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_Automation_Practice_Web_Test {
	WebDriver driver;
	@BeforeClass
	void display() {
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	@Test
	void web_test() throws InterruptedException {
		//Name
		driver.findElement(By.id("name")).sendKeys("Revan");
		Thread.sleep(2000);
		//email
		driver.findElement(By.id("email")).sendKeys("revankole@gmail.com");
		Thread.sleep(2000);
		//phone
		driver.findElement(By.id("phone")).sendKeys("7843050773");
		Thread.sleep(2000);
		//address
		driver.findElement(By.id("textarea")).sendKeys("Solapur");
		Thread.sleep(2000);
		//gender
		driver.findElement(By.xpath("(//input[@name='gender'])[1]")).click();
		Thread.sleep(2000);
		//Days
		List<WebElement> checkboxes =driver.findElements(By.className("form-check-input"));

		for (WebElement checkbox : checkboxes) {
		    if (!checkbox.isSelected()) {
		        checkbox.click();
		    }
		}
		Thread.sleep(2000);
		//country
		WebElement dropdown = driver.findElement(By.xpath("(//select)[1]"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("India");
		Thread.sleep(2000);
		//colors
		driver.findElement(By.xpath("(//option[@value='white'])")).click();
		Thread.sleep(2000);
		//sortedList
		driver.findElement(By.xpath("(//option[@value='cheetah'])")).click();
		Thread.sleep(2000);
		//datePicker
		driver.findElement(By.id("datepicker")).sendKeys("10/20/2026");
		Thread.sleep(2000);
		//datePicker2
		driver.findElement(By.id("txtDate")).click();
		driver.findElement(By.xpath("//a[text()='20']")).click();
		Thread.sleep(2000);
		//start-date
		driver.findElement(By.id("start-date")).sendKeys("10/20/2025");
		Thread.sleep(2000);
		//end-date
		driver.findElement(By.id("end-date")).sendKeys("10/20/2026");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='calculateRange()']")).click();
		Thread.sleep(2000);
		//fileuplod-single
		driver.findElement(By.id("singleFileInput")).sendKeys("E:/CV/REVAN_RESUME(3Ri).pdf");
		driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
		Thread.sleep(2000);
		//multiple file upload
		driver.findElement(By.id("multipleFilesInput")).sendKeys("E:/CV/REVAN_RESUME(3Ri).pdf\n"
		+ "E:/CV/revan_resume.pdf");
		driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
		Thread.sleep(2000);
		
	}
//	@AfterClass
//	public void closeBrowser() {
//	    if (driver != null) {
//	        driver.quit();
//	    }
//	}
	
}
