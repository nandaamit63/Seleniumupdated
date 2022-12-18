package StepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assignment {

	pom pm;
	ApplicationHooks hooks;
	public Assignment(ApplicationHooks hooks)
	{
		this.hooks=hooks;
	}

@Given("User is on ecommerce login page")
public void user_is_on_ecommerce_login_page() {
    hooks.setDriver();
}
@When("User enter invalid username and password on ecommerece site")
public void user_enter_invalid_username_and_password_on_ecommerece_site() {
    hooks.getDriver().findElement(By.id(pm.username)).sendKeys("Admin");
    hooks.getDriver().findElement(By.id("password")).sendKeys("admin123");
}
@And("User clicks on the login button with invalid credentials on ecommerce site")
public void user_clicks_on_the_login_button_with_invalid_credentials_on_ecommerce_site() {
   hooks.getDriver().findElement(By.id("login-button")).click();
}
@Then("user got an error message on ecommerce site")
public void user_got_an_error_message_on_ecommerce_site() {
  System.out.println("Publish the result");
}
}
