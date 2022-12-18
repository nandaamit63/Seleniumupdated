package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplicationHooks {
	public WebDriver driver;
	ApplicationHooks hooks;
	
	public void setUp() {
		setDriver();
	}
	
	public void setDriver() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	/*@After
	public void teardown() {
		getDriver().quit();
	}*/

}
