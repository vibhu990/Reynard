package Reynard_Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class QHSE_Management extends LoginClass {

	
	public static void QHSE_Management() {
		
		WebElement m= driver.findElement(By.xpath("//span[text()='QHSE Cards']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].click();", m);
	      
	}
	
	public static void SafeCard() {
		
		driver.findElement(By.xpath("//p[text()='Safe Card']")).click();
		driver.findElement(By.id("title")).sendKeys(prop.getProperty("Title"));
		driver.findElement(By.xpath("//div[@id='project']")).click();
		List <WebElement> list1= driver.findElements(By.xpath("//li[@class='MuiMenuItem-root MuiMenuItem-gutters MuiButtonBase-root css-8fphk5']"));
		System.out.println(list1.size());
		list1.get(1).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[starts-with(@id,'mui-')]")).click();
        List<WebElement> list2=driver.findElements(By.xpath("//ul[starts-with(@id,'mui-')]"));
        System.out.println(list2.size());
        list2.get(0).click();
        driver.findElement(By.xpath("//div[@id='category']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> list3=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        System.out.println(list3.size());
        list3.get(1).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
      
	}
	public static void projectdropdown() {
	      
	      driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[1]/div")).click();
	      List<WebElement> list=driver.findElements(By.xpath("//li[@class='MuiMenuItem-root MuiMenuItem-gutters MuiButtonBase-root css-1dns1hn']"));
	      System.out.println(list.size());
	     list.get(1).click();
		
	}
}
