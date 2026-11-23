package edu.bsu.cs;

public class RomanNumeralConverter {
    public static String convert(int number) {
        StringBuilder numeral = new StringBuilder();
        if (number == 5) {
            numeral.append("V");
        }
        else if (number == 4) {
            return "IV";
        }
        else {
            for (int i = number; i > 0; i--) {
                numeral.append("I");
            }
        }
        return numeral.toString();
    }
}
