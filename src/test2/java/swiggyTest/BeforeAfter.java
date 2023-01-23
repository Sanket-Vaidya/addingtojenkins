package swiggyTest;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter extends Tools {
	@Before
	public void startchrome(Scenario scenario) {
		Driver.init();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
	}
	
	@After
	public void close() {
		driver.quit();
	}

}
