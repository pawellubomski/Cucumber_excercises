import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalcStepDef {
    private Calculator calculator;

    @Given("I have a calculator")
    public void iHaveACalculator() {
        this.calculator = new Calculator();
    }

    @When("I divide {int} by {int}")
    public void iDivideBy(int liczba1, int liczba2) {
        calculator.div(liczba1, liczba2);
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int expected) {
        assertEquals("The expected does not equal the actual", String.valueOf(expected), calculator.getDisplay());
    }

    @Then("the error message should be {string}")
    public void theErrorMessageShouldBe(String expected) {
        assertEquals("Cannot divide by 0!", String.valueOf(expected), calculator.getDisplay());
    }
    @Before
    public void doSomethingBeforeScenario() {
        //wykonaj operacje przed wykonaniem scenariusza
        System.out.println("Starting scenario...");
    }
    @After
    public void doSomethingAfterScenario(Scenario scenario){
        //wykonaj operacje po wykonaniem scenariusza
        System.out.println("Ending scenario...");
    }
    @BeforeStep
    public void doSomethingBeforeStep(Scenario scenario){
        //wykonaj operacje przed wykonaniem kroku
        System.out.println("BeforeStep | tags: "+scenario.getSourceTagNames());
    }
    @AfterStep
    public void doSomethingAfterStep(Scenario scenario){
        //wykonaj operacje po wykonaniu kroku
        System.out.println("AfterStep | name: "+scenario.getName());
    }
    /**
     * Poniżej Hooks warunkowe
     */
    @After("@success and not @fail")
    public void doSomethingAfterSuccessScenario(Scenario scenario){
        System.out.println("After hooks | @success and not @fail");
    }
    @After("@fail and not @success")
    public void doSomethingAfterFailesScenario(Scenario scenario){
        System.out.println("After hooks | @fail and not @success");
    }
}
