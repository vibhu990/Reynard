package Reynard_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class MainClass extends LoginClass {
	
	public static void main(String[] args) throws Exception {
		login();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		QHSE_Management.QHSE_Management();
		//QHSE_Management.projectdropdown();
		//QHSE_Management.SafeCard();
		Unsafe_Class.unsafe();
		//driver.close();
			
		}
		
		
	}


