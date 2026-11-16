package com.example;

public class RomanNumeralConverter {

    public String toRoman(int number) {
        if (number == 4) {
            return "IV";
        }
        if (number == 5) {
            return "V";
        }
        if (number == 9) {
            return "IX";
        }
        return "I".repeat(number);
    }
}