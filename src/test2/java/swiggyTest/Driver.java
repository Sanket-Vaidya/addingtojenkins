package swiggyTest;

import org.openqa.selenium.chrome.ChromeDriver;

import in.swiggy.pages.Checkout;
import in.swiggy.pages.FoodPage;
import in.swiggy.pages.LandingPage;
import in.swiggy.pages.Restaurant;

public class Driver extends Tools {
	
	public static LandingPage landingpage;
	public static Restaurant restaurant;
	public static FoodPage foodadd;
	public static Checkout messageCheck;
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		driver=new ChromeDriver();
		landingpage=new LandingPage(driver);
		restaurant=new Restaurant(driver);
		foodadd=new FoodPage(driver);
		messageCheck=new Checkout(driver);
		
	}

}
