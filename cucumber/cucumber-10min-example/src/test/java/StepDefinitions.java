import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	Belly belly = new Belly();
	
	@Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {        
        belly.eat(cukes);
    }
	
	@When("^I wait (\\d+) hour$")
	public void i_wait_hour(int hours) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions		
	    belly.wait(hours);
	}
	
	@Then("^my belly should growl$")
	public void my_belly_should_growl() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(belly.bellyGrowls());
	}
	
}
