package com.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralSteps {

    private final RomanNumeralConverter converter = new RomanNumeralConverter();
    private int number;
    private String result;

    @Given("the number {int}")
    public void theNumber(int number) {
        this.number = number;
    }

    @When("I convert it to a Roman numeral")
    public void iConvertItToARomanNumeral() {
        result = converter.toRoman(number);
    }

    @Then("the result should be {string}")
    public void theResultShouldBe(String expected) {
        assertEquals(expected, result);
    }
}