package stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {
	WebDriver driver;


	@Given("User is on login page")
	public void user_is_on_login_page() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://the-internet.herokuapp.com/");
	}
	@When("User enters valid login credentials")
	public void user_enters_valid_login_credentials() {
		
		driver.findElement(By.name("username")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
		driver.findElement(By.cssSelector("radius")).click();
	  
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String id, String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys(id);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.cssSelector("radius")).click();
	}

	@Then("User is on Home page")
	public void user_is_on_home_page() {
	    
		boolean success = driver.findElement(By.cssSelector("div.success")).isDisplayed();
		Assert.assertTrue(success);
		
	}
	
	
	






}
