package swiggyTest;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyFoodOnSwiggy extends Driver {
	
	@Given("a user is on Swiggy.com")
	public void a_user_is_on_swiggy_com()  {
		String actualTitle=driver.getTitle();
		String expectedTitle="Order food online from India's best food delivery service. Order from restaurants near you";
		Assert.assertEquals(actualTitle, expectedTitle);
	

	}

	@When("he enters ‘Bangalore, Karnatka, India’ in the search box")
	public void he_enters_bangalore_karnatka_india_in_the_search_box()  {
		
		landingpage.enterLocation();
		

	}

	@When("clicks on find food")
	public void clicks_on_find_food() throws InterruptedException {
		landingpage.clickfood();

	}

	@When("clicks on the first restaurant on the next page")
	public void clicks_on_the_first_restaurant_on_the_next_page() {
		
		restaurant.clickRestaurant();

	}

	@When("clicks ‘Add’ on the first item of the restaurant page")
	public void clicks_add_on_the_first_item_of_the_restaurant_page() {
		foodadd.clickAdd();

	}

	@When("clicks ‘Checkout’ button")
	public void clicks_checkout_button() {
		foodadd.clickCheckout();

	}

	@Then("he must see the message-{string}.")
	public void he_must_see_the_message(String string) throws InterruptedException {
		
		string=messageCheck.message();
		String expectedString="SECURE CHECKOUT";
		Assert.assertEquals(expectedString, string);

	}


}
