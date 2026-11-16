package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, Fizz"
    })
    public void testConvert(int number, String expected) {
        assertEquals(expected, fizzBuzz.convert(number));
    }
}