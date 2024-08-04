package stepdefs;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StringOperationsStepDefs {
	String name1;
	String name2;
	String ActualResult;
	@Given("The first name is {string}")
	public void the_first_name_is(String str1) {
		this.name1=str1;
	}

	@Given("The second name is {string}")
	public void the_second_name_ios(String str2) {
		this.name2=str2;
	}

	@When("I compare two strings")
	public void i_compare_two_strings() {
		if(name1.equals(name2)) {
			ActualResult="true";
		}else {
			ActualResult="true";
		}
	}

	@Then("The result is {string}")
	public void the_result_is(String ExpResult) {
		Assert.assertEquals(ExpResult,ActualResult );
	}

}
