package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import swiggyTest.*;

public class FoodPage extends Driver {

	WebDriverWait wait;

	@FindBy(xpath = "(//div[@class='_1RPOp'])[1]")
	private WebElement add;

	@FindBy(xpath = "//button[@class='_1gPB7']")
	private WebElement checkout;

	public FoodPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	public void clickAdd() {

		wait.until(ExpectedConditions.visibilityOf(add));
		add.click();
		if (driver.findElement(By.xpath("(//span[@class='_1X1xw'])[1]")).isDisplayed()) {
			driver.findElement(By.xpath("(//span[@class='_1X1xw'])[1]")).click();
			driver.findElement(By.xpath("//div[@class='_3coNr']")).click();
		}

	}

	public void clickCheckout() {
		wait.until(ExpectedConditions.visibilityOf(checkout));
		checkout.click();
	}

}
