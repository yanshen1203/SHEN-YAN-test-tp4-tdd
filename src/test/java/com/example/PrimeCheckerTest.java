package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Set;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTest {

    private final PrimeChecker primeChecker = new PrimeChecker();

    private static final Set<Integer> PRIMES_UP_TO_100 = Set.of(
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
            53, 59, 61, 67, 71, 73, 79, 83, 89, 97
    );

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 4})
    public void testNonPrimeNumbers(int number) {
        assertFalse(primeChecker.isPrime(number), number + " should not be considered a prime number");
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3})
    public void testPrimeNumbers(int number) {
        assertTrue(primeChecker.isPrime(number), number + " should be considered a prime number");
    }

    static IntStream numbersUpTo100() {
        return IntStream.rangeClosed(0, 100);
    }

    @ParameterizedTest
    @MethodSource("numbersUpTo100")
    public void testAllNumbersUpTo100(int number) {
        boolean expected = PRIMES_UP_TO_100.contains(number);
        assertEquals(expected, primeChecker.isPrime(number),
                number + (expected ? " should" : " should not") + " be considered a prime number");
    }
}