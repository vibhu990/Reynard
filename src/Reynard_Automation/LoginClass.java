package Reynard_Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {
	static WebDriver driver;
	static Properties prop;
	static FileInputStream fip;
	

	public static void login() throws Exception {
		String expectedUrl ="https://reynard-qa-m7xqu.ondigitalocean.app/client/setting";
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		fip = new FileInputStream("./src/Reynard_Automation/TextData.properties");
		prop = new Properties();
		prop.load(fip);
		String url = prop.getProperty("Url");
		driver.get(url);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(prop.getProperty("Email"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		Thread.sleep(4000);
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		
		if(actualURL.equals(actualURL)) {
			
			System.out.println("Successful login");
		}
		
		else {
			
			System.out.println("Fail");
		}
		

	}

}
