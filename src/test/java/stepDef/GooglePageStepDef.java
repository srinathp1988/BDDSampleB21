package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class GooglePageStepDef {
	
	WebDriver driver;
	@Given("I am open Browser")
	public void i_am_open_browser() {
	    // Write code here that turns the phrase above into concrete actions
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	}
	@When("I type Java")
	public void i_type_java() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement search = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		search.sendKeys("Java");
		search.submit();
	}
	@When("I click search")
	public void i_click_search() {
	    
	}
	@Then("Search result should be opened")
	public void search_result_should_be_opened() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getTitle(),"Java - Google Search");
	}




}
