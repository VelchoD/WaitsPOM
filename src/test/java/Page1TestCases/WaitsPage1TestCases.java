package Page1TestCases;

import org.testng.annotations.Test;

import Base.Base;
import pageObjects.Page1Objects;
import testdata.testdata;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class WaitsPage1TestCases extends Base {
	
	
	Page1Objects pw;
	testdata td ;

 
  @BeforeMethod
  public void beforeMethod()  {
	  
		openApplication();
		pw = new Page1Objects();
		td = new testdata();
	}
  
  @Test
  public void TestWaits1() {
	  pw.Page1 ();
	  String actualmessage=driver.findElement(By.xpath("//h4[normalize-space()='Hello World!']")).getText();
      Assert.assertEquals(actualmessage, td.expectedmessage);
      System.out.println(actualmessage);
	  
  }
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
  }  
 }
