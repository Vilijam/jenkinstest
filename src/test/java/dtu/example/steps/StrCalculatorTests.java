package dtu.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/* 
 * These are the step definitions for the StrCalculator example.
 * Please remove when you have written your own code and the example
 * is not used anymore.
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import dtu.example.StrCalculator;

public class StrCalculatorTests {
    private StrCalculator calculator;
    private Integer i;

    @Given("the Str Calculator is initialized")
    public void theStrCalculatorIsInitialized() {
        calculator = new StrCalculator();
    }

    @When("i add the numbers {string}")
    public void theNumbersAreAdded(String s) {
        i = calculator.add(s);
    }

    @Then("the result2 should be {int}")
    public void theResultShouldBe(Integer expectedResult) {
        assertEquals(expectedResult, i);
    }

}
