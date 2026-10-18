package rk.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_hand {
public static void main(String[] args) {
	//iframe
	//1.index
	//2.idorname
	//3.webelement
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html#google_vignette");
	//driver.switchTo().frame(0); //1.id
	WebElement iframe=driver.findElement(By.xpath(""))
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Revan");
}
}
