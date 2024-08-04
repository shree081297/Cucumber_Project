package stepdefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefs {
	int num1;
	int num2;
	int ActResult;
	List<Integer> numbers;
	Map<String, Integer> cart;
	int actBill;
	DataTable dataTable;

	@Given("There are two numbers {int} and {int}")
	public void there_are_two_numbers_and(int a, int b) {
		// Write code here that turns the phrase above into concrete actions
		num1 = a;
		num2 = b;
	}

	@When("Adding of two numbers")
	public void adding_of_two_numbers() {
		// Write code here that turns the phrase above into concrete actions
		ActResult = num1 + num2;
	}

	@Then("The final output is {int}")
	public void the_final_output_is(int ExptecdResult) {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(ActResult, ExptecdResult);
	}

	@When("sub of two numbers")
	public void sub_of_two_numbers() {
		// Write code here that turns the phrase above into concrete actions
		ActResult = num1 - num2;
	}

	@When("Multiplying two numbers")
	public void multiplying_two_numbers() {
		// Write code here that turns the phrase above into concrete actions
		ActResult = num1 * num2;
	}

	@Given("There are multiple values")
	public void there_are_multiple_values(List<Integer> list1) {
		this.numbers = list1;
	}

	@When("Adding the given values")
	public void adding_the_given_values() {
		for (int num : numbers) {
			ActResult = ActResult + num;
		}
	}

	@Given("The items are added to my cart")
	public void the_items_are_added_to_my_cart(Map<String, Integer> map1) {
		this.cart = map1;
	}

	@When("I do the checkout")
	public void i_do_the_checkout() {
		for (String items : cart.keySet()) {
			actBill = actBill + cart.get(items);
		}
	}

	@Then("The final bill is {int}")
	public void the_final_bill_is(int ExpBill) {
		Assert.assertEquals(ExpBill, actBill);
	}

@Given("The items are added to my cart with given quantity")
public void the_items_are_added_to_my_cart_with_given_quantity(io.cucumber.datatable.DataTable dataTable) {
   this.dataTable=dataTable;
}

@When("I do checkout for multiple quantity")
public void i_do_checkout_for_multiple_quantity() {
	int rows=dataTable.height();
	for(int i=0;i<rows;i++) {
		String items=dataTable.cell(i, 0);
		int qty=Integer.parseInt(dataTable.cell(i, 1));
		int total=Integer.parseInt(dataTable.cell(i, 2));
		actBill=actBill+ qty* total;
	}
   
}


}
