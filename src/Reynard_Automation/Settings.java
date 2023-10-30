package Reynard_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Settings extends LoginClass {

	public static void projectManagement() {

		driver.findElement(By.xpath("//p[text()='Project Setup']")).click();
		driver.findElement(By.xpath("//p[text()='New Project']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Project name']")).sendKeys(prop.getProperty("Project"));
		boolean button = driver.findElement(By.xpath("//button[text()='Submit']")).isEnabled();

		if (button == true) {

			driver.findElement(By.xpath("//button[text()='Submit']")).click();

		}

		else {
			System.out.println("fail");
		}

		/*
		 * try {
		 * 
		 * // Wait until the element is visible and interactable WebDriverWait wait =
		 * new WebDriverWait(driver,Duration.ofSeconds(10)); WebElement button =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//span[text()='Feedback']"))); // Perform actions on the element
		 * button.click(); } catch (ElementNotInteractableException e) {
		 * System.out.println("Element not interactable: " + e.getMessage());
		 * 
		 * 
		 * //driver.findElement(By.xpath("//p[text()='Safe Card']")).click();
		 * //driver.findElement(By.xpath("//input[@placeholder='Please Enter Title']")).
		 * sendKeys(prop.getProperty("Title")); }
		 */
	}

	public static void project() {
		
		
		driver.findElement(By.xpath("//p[text()='Project Setup']")).click();
		boolean viewbutton = driver
				.findElement(By.xpath("//div[@id='root']/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]"))
				.isEnabled();
		if (viewbutton == false) {
			driver.findElement(By.xpath("//div[text()='Select Project']")).click();
            driver.findElement(By.xpath("//li[text()='KW project']")).click();

		}
		
		}
	public static void editProject(){
		String text = "Project has been updated successfully";
		driver.findElement(By.xpath("//p[text()='Project List']")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/table/tbody/tr[2]/td[3]/div/div/button[1]")).click();
		driver.findElement(By.xpath("//button[text()='Loading...']")).click();
		String text1= driver.findElement(By.xpath("//span[text()='Project has been updated successfully']")).getText();
	
		if (text.equals(text1)) {
			
			System.out.println("Pass");
		}
		else {
			
			System.out.println("Fail");
		}
	}

	public static void location() {
		
		driver.findElement(By.xpath("//div[@id='root']/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(prop.getProperty("LocationName"));
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
	}
	
	public static void projectString() {
		
		driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[2]/div/div/div[2]/button[2]/p")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(prop.getProperty("StringName"));
		driver.findElement(By.id("from")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
		driver.findElement(By.id("to")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-toLocation\"]/div[3]/ul/li[3]")).click();
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}
	public static void Asset() throws InterruptedException {
		String textdata= "No data available";
		driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[3]/div/div/div[2]/button[2]/p")).click();
		driver.findElement(By.name("cableName")).sendKeys(prop.getProperty("CableName"));
		driver.findElement(By.id("from")).click();
		String  textData= driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).getText();
		Thread.sleep(5000);
		
		if (textdata.equals(textData)) {
			WebElement cancel= driver.findElement(By.xpath("html/body/div[2]/div[3]/div[1]/span"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
		      js.executeScript("arguments[0].click();", cancel);
			location();
			
		}
		
		else {
			
			driver.findElement(By.xpath("//*[@id=\"menu-fromLocation\"]/div[3]/ul/li[2]")).click();
			driver.findElement(By.id("to")).click();
			driver.findElement(By.xpath("//*[@id=\"menu-toLocation\"]/div[3]/ul/li[2]")).click();
			driver.findElement(By.xpath("//input[@placeholder='Manufacture*']")).sendKeys(prop.getProperty("Manufacture"));
			driver.findElement(By.name("typeMm2")).sendKeys(prop.getProperty("Typemm2"));
			driver.findElement(By.id("string")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
					
		}
		
	}
	
	
	public static void team() {
		
		driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[4]/div/div/div[2]/button[2]")).click();
		driver.findElement(By.name("teamsWfmName")).sendKeys(prop.getProperty("teamsWfmName"));
		driver.findElements(By.xpath("//button[text()='Submit']"));
	}
	
	
	
}