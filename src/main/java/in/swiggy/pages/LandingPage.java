package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	
	WebDriverWait wait;
	
	@FindBy(xpath="//input[contains(@id,'location')]")
	private WebElement dropdown;
	
	@FindBy(xpath="(//span[@class='_2W-T9'])[1]")
	private WebElement findfood;
	
	

	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	

	
	public void enterLocation() {
	dropdown.sendKeys("Bangalore, Karnataka, India");
	}
	
	public void clickfood() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(findfood));
		findfood.click();
		
	}

}
