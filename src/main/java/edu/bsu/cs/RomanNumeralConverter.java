package edu.bsu.cs;

public class RomanNumeralConverter {
    public static String convert(int number) {
        StringBuilder numeral = new StringBuilder();
        if (number == 5) {
            numeral.append("V");
        }
        else if (number == 4) {
            numeral.append("IV");
        }
        else {
            numeral.append("I".repeat(number));
        }
        return numeral.toString();
    }
}
