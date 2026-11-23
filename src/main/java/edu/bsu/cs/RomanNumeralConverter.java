package edu.bsu.cs;

public class RomanNumeralConverter {
    public static String convert(int number) {
        StringBuilder numeral = new StringBuilder();
        for (int i = number; i > 0; i--) {
            numeral.append("I");
        }
        return numeral.toString();
    }
}
