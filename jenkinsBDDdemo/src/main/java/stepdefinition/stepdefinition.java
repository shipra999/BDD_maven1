package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stepdefinition {


		String title;
		WebDriver driver;
		@Given("^Login application should be available$")
		public void login_application_should_be_available() throws Throwable {
			driver = new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com");
		    // Write code here that turns the phrase above into concrete actions
		    
		}

		@When("^validate login application$")
		public void validate_login_application() throws Throwable {
			title=driver.getTitle();
			System.out.println(title);
			System.out.println("hello");
		    // Write code here that turns the phrase above into concrete actions
		   
		}

		@Then("^login should be successful$")
		public void login_should_be_successful() throws Throwable {
			Assert.assertEquals("OrangeHRM",title);
		    // Write code here that turns the phrase above into concrete actions
		    
		}

	}


