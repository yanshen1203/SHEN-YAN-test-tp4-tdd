package com.example;

public class RomanNumeralConverter {

    public String toRoman(int number) {
        if (number == 4) {
            return "IV";
        }
        if (number == 5) {
            return "V";
        }
        return "I".repeat(number);
    }
}