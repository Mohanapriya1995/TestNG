package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.pageexecu.PageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends PageExe{
	@Given("Login to Application")
	public void login_to_application() {
		browserLaunch();


		}
	@When("Enter the username {string}")
	public void enter_the_username(String user) {
		userName(user);
	    
	}
	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
		password(pass);
	    
	}
	@When("Enter the login button")
	public void enter_the_login_button() {
		loginButton();
	    
	}
	@Then("Validate the Home Page")
	public void validate_the_home_page() {
		System.out.println("Validation done");	    
	}

	
	@Then("Validate the Error Message\"Invalid Login details or Your Password might have expired.\"")
	public void validate_the_error_message_invalid_login_details_or_your_password_might_have_expired() {
		String actualError=driver.findElement(By.xpath("//b[contains(text(),'Invalid Login details')]")).getText();
    	String expectedError="Invalid Login details or Your Password might have expired. Click here to reset your password";
     	Assert.assertEquals(actualError,expectedError); 
     	System.out.println(actualError);
}
}
