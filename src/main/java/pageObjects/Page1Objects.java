package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Base.Base;
import testdata.testdata;

public class Page1Objects extends Base {
	
	 testdata td=new testdata ();


	//Web element start button
	 @CacheLookup
	@FindBy(xpath = "//button[normalize-space()='Start']")
	WebElement StartButton;
	
	//Web element start button
	@FindBy(xpath = "//h4[normalize-space()='Hello World!']")
	WebElement message;
	
	
	//Init Elements
	public Page1Objects() {
		PageFactory.initElements(driver, this);
	}
	
	/*Mehod*/
	public void Page1() {
		StartButton.click();
		WebDriverWait wait=new WebDriverWait(driver,30);
	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Hello World!']")));
	
	}
	
}
