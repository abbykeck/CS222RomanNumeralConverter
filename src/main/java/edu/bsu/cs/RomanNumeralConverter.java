package edu.bsu.cs;

public class RomanNumeralConverter {
    public static String convert(int number) {
        StringBuilder numeral = new StringBuilder();
        if (number == 4) {
            return "IV";
        }
        for (int i = number; i > 0; i--) {
            numeral.append("I");
        }
        return numeral.toString();
    }
}
