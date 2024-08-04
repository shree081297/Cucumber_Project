package stepdefs;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
	WebDriver driver = Hooks.driver;

	@Given("I have launched the appliaction")
	public void i_have_launched_the_appliaction() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Hooks.test.log(LogStatus.PASS, "Application has launched");
	}

	@Given("I clicks on Login link")
	public void i_clicks_on_Login_link() {
		// Write code here that turns the phrase above into concrete actions
		WebElement loginBtn = driver.findElement(By.xpath("//a[@class='login']"));
		loginBtn.click();
		Hooks.test.log(LogStatus.PASS, "User click's on the link");
	}

	@When("I enter the user name")
	public void i_enter_the_user_name() {
		// Write code here that turns the phrase above into concrete actions
		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys("abc@mail.com");
		Hooks.test.log(LogStatus.PASS,"User sucessfully entered the user");
	}

	@When("I enter the password")
	public void i_enter_the_password() {
		// Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Shree@12345");
		Hooks.test.log(LogStatus.PASS, "User sucessfully entered password");
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() {
		// Write code here that turns the phrase above into concrete actions
		WebElement loginBtn = driver.findElement(By.name("btn_login"));
		loginBtn.click();
		Hooks.test.log(LogStatus.PASS, "User click's on Login button");

	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String ExpectedMessage) {
		// Write code here that turns the phrase above into concrete actions
		WebElement error = driver.findElement(By.id("msg_box"));
		String ActualMessage = error.getText();
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		Hooks.test.log(LogStatus.PASS, "Validating the result");

	}

	@When("I enter the user name as {string}")
	public void i_enter_the_user_name_as(String UserName) {
		// Write code here that turns the phrase above into concrete actions
		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys(UserName);
		Hooks.test.log(LogStatus.PASS, "User sucessfully entered email"+ UserName);


	}

	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String pwd) {
		// Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pwd);
		Hooks.test.log(LogStatus.PASS, "User sucessfully entered password"+ pwd);

	}

	@Then("I see the login options in Login page")
	public void i_see_the_login_options_in_Login_page(List<String> loginOptions) {
		for (String option : loginOptions) {

			WebElement otherOptions = driver.findElement(By.xpath("//span[text()='" + option + "']"));
			Assert.assertTrue(otherOptions.isDisplayed());
			Hooks.test.log(LogStatus.PASS, "User verifying the options in Login page"+ otherOptions);

		}
	}

}
