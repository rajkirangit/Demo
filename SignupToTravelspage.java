package com.task;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SignupToTravelspage {
	
	public static void main(String[] args) {
		
		String path = ".\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Success ! ! !");
	
	driver.findElement(By.linkText("REGISTER")).click();;
	
	// Sign up details 
	//Contact information
	System.out.println("Contact information");
	driver.findElement(By.name("firstName")).sendKeys("Raj");
	driver.findElement(By.name("lastName")).sendKeys("Kiran");
	driver.findElement(By.name("phone")).sendKeys("989427897894");
	driver.findElement(By.name("userName")).sendKeys("rajkiran");
	System.out.println("Contact information successfully added");
	
	//Mailing information
	System.out.println("Mailing information");
	driver.findElement(By.name("address1")).sendKeys("BalajiNagar");
	driver.findElement(By.name("address2")).sendKeys("Nizampet");
	driver.findElement(By.name("city")).sendKeys("Hyderabad");
	driver.findElement(By.name("state")).sendKeys("Telanana");
	driver.findElement(By.name("postalCode")).sendKeys("5354778");
	
	Select dropdown = new Select(driver.findElement(By.name("country")));
	dropdown.selectByVisibleText("INDIA");
	System.out.println("Mailing information successfully added");
	
	//User information
	System.out.println("User information");
	driver.findElement(By.id("email")).sendKeys("Rajkiran");
	driver.findElement(By.name("password")).sendKeys("Rajkiran@123");
	driver.findElement(By.name("confirmPassword")).sendKeys("Rajkiran@123");
	System.out.println("User information successfully added");
	
	driver.findElement(By.name("register")).click();
	
	System.out.println("Successfully registered ");
	
	}
	
	
}
