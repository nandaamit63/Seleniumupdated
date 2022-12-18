package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assignment2 {

	ApplicationHooks hooks;
	public Assignment2(ApplicationHooks hooks)
	{
		this.hooks=hooks;
	}
	
/*	@Given("User is on ecommerce login page")
	public void user_is_on_ecommerce_login_page() {
		 hooks.setDriver();
	}*/
	@When("user enter valid username and password on ecommerce site")
	public void user_enter_valid_username_and_password_on_ecommerce_site() throws IOException {
	    ExcelWriting ex= new ExcelWriting(hooks.getDriver());
	    ex.excelWriting();
	}
	@And("user clicks on the login button with valid credentials on ecommerce site")
	public void user_clicks_on_the_login_button_with_valid_credentials_on_ecommerce_site() {
	   hooks.getDriver().findElement(By.id("login-button")).click();
	}
	@And("user able to add an item into cart on ecommerce site")
	public void user_able_to_add_an_item_into_cart_on_ecommerce_site() {
	   hooks.getDriver().findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	   hooks.getDriver().findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).click();
	   
	}
	@Then("User is able to send the detail of that item on an excel")
	public void user_is_able_to_send_the_detail_of_that_item_on_an_excel() throws IOException {
	 String price= hooks.getDriver().findElement(By.xpath("//div[@class='inventory_details_price']")).getText();
	 String name= hooks.getDriver().findElement(By.xpath("//div[@class='inventory_details_name large_size']")).getText();
		ExcelReading ex= new ExcelReading();
		ex.excelReading(price, name);
		System.out.println("Done");
		
	}


}
