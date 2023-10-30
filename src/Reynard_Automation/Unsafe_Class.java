package Reynard_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Unsafe_Class extends LoginClass {
	static List<WebElement> lis3;
	public static void unsafe() {
		
		driver.findElement(By.xpath("//p[text()='Unsafe Card']")).click();
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(prop.getProperty("UnsafeTitle"));
		driver.findElement(By.xpath("//div[@id='project']")).click();
		List<WebElement> lis1= driver.findElements(By.xpath("//li[@role='option']"));
		lis1.get(2).click();
		driver.findElement(By.xpath("//input[starts-with(@id,'mui-')]")).click();
		List<WebElement> lis2=driver.findElements(By.xpath("//li[starts-with(@id,'mui-')]"));
		lis2.get(0).click();
		driver.findElement(By.xpath("//div[@id='category']")).click();
		lis3=driver.findElements(By.xpath("//li[@role='option']"));
		lis3.get(1).click();
		driver.findElement(By.xpath("//div[@id='severity']")).click();
		lis3=driver.findElements(By.xpath("//li[@role='option']"));
		lis3.get(3).click();
		driver.findElement(By.xpath("//div[@id='likelihood']")).click();
		lis3=driver.findElements(By.xpath("//li[@role='option']"));
		lis3.get(3).click();
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
	    
	}

}
