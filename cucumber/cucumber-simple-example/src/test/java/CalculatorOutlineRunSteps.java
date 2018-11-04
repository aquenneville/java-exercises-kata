import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorOutlineRunSteps {

	private int total;
	private Calculator calculator;
	
	@Before 
	private void init() {
		total = -1;
	}
	
	@Given("^I have a calculator$")
	public void i_have_a_calculator() throws Throwable {
	    calculator = new Calculator();
	}

	@When("^I add (-?\\d+) and (-?\\d+)$")
	public void i_add_and(int num1, int num2) throws Throwable {
	    total = calculator.add(num1, num2);
	}
	
	@Then("^the result should be (-?\\d+)$")
	public void the_result_should_be(int result) throws Throwable {
		Assert.assertThat(total, Matchers.equalTo(result));
	}

}
