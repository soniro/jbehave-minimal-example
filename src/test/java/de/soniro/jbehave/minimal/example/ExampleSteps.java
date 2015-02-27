package de.soniro.jbehave.minimal.example;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class ExampleSteps {

    @Given("a system state")
    public void givenASystemState() {
        System.out.println("Given");
    }

    @When("I do something")
    public void whenIDoSomething() {
        System.out.println("When");
    }

    @Then("system is in a different state")
    public void thenSystemIsInADifferentState() {
        System.out.println("Then");
    }

    @Then("the test fails")
    public void thenTheTestFails() {
        Assert.fail("An error occured");
    }

    @Then("an exception is thrown")
    public void thenAnExceptionIsThrown() {
        throw new RuntimeException("An unexpected exception!");
    }
}
