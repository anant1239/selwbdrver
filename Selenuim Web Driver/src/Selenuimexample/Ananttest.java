package Selenuimexample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ananttest {
	
 @BeforeSuite
	  public void beforeSuite() 
	{
		System.out.println("This is the before suite");
	}
 
 @BeforeTest
 public void beforeTest() 
 {
	 
	 System.out.println("This is the before test method");
 }
 
 @BeforeClass
 public void beforeClass()
 {
	 System.out.println("This is the before class method");
	 
 }

 @BeforeMethod
 public void beforeMethod()
 {
	 System.out.println("This is the before method");
	 
 }


  @Test
  public void f()
  {
	  System.out.println("This is the test which we will conduct out");
	  
  }
 
  @AfterMethod
  public void afterMethod()
  {
	System.out.println("This is the after method");  
  }


  @AfterClass
  public void afterClass() 
  {
	  System.out.println("This is the after class method");
	  
  }

  

  @AfterTest
  public void afterTest()
  {
	System.out.println("This is the after test method");  
  }

}

