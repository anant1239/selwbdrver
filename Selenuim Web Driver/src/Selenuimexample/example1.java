package Selenuimexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example1 {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Whichever the browser you use, you have to download the driver for that browser.
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenuim Web Driver\\chromedriver.exe");
		//the below code is for firefox driver
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Documents\\geckodriver.exe");
		
		//Web driver is an interface 
		//Interface is a class which contains all the browser implementation.
		WebDriver driver= new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		//these lines of code are interpreter(the above 3)
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();	
		driver.close();
		driver.quit();
		
	}

}
