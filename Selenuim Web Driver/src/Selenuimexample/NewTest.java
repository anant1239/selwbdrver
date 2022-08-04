package Selenuimexample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	//if the web driver is defined in the class it is accessible to all the methods
	//if we need to test a product again and again, we want automation to run it since it will become tedious and time consuming
	
	WebDriver driver;
	
	  @BeforeTest
	  public void beforeTest()
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Documents\\geckodriver.exe");
			
			//Web driver is an interface 
			//Interface is a class which contains all the browser implementation.
			 driver= new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com");
			//Get title is to fetch the title of the webpage, and store it in a string variable called title
			String Title= driver.getTitle();
			String Url=driver.getCurrentUrl();
			System.out.println(Title +"  "+  Url);
			Assert.assertEquals(Title, "OrangeHRM");
			Assert.assertEquals(Url,"https://opensource-demo.orangehrmlive.com/");
		
	  }
	  
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  //if I want to fetch the data  (value, what is stored) from the application. Value is an attribute, and the value of a value is the username
	  String Username=driver.findElement(By.name("txtUsername")).getAttribute("value");
	  System.out.println(Username);
	  Assert.assertEquals(Username, "Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  String Password=driver.findElement(By.id("txtPassword")).getAttribute("value");
	  System.out.println(Password);
	   Assert.assertEquals(Password, "admin123");
		driver.findElement(By.id("btnLogin")).click();
		String Login=driver.findElement(By.id("btnLogin")).getAttribute("value");
		System.out.println(Login);
		Assert.assertEquals(Login, "LOGIN");
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();	
	  
  }


  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
