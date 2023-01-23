package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout {

	WebDriverWait wait;

	@FindBy(xpath = "//span[@class='_2EQ3T']")
	private WebElement secureCheckout;

	public Checkout(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	}

	public String message() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(secureCheckout));
		String messageActual = secureCheckout.getText();
		return messageActual;
	}

}
