package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {
    @Test
    public void testConvertOne() {
        String actual = RomanNumeralConverter.convert(1);
        Assertions.assertEquals("I", actual);
    }

    @Test
    public void testConvertTwo() {
        String actual = RomanNumeralConverter.convert(2);
        Assertions.assertEquals("II", actual);
    }

    @Test
    public void testConvertFour() {
        String actual = RomanNumeralConverter.convert(4);
        Assertions.assertEquals("IV", actual);
    }

    @Test
    public void testConvertFive() {
        String actual = RomanNumeralConverter.convert(5);
        Assertions.assertEquals("V", actual);
    }

    @Test
    public void testConvertEight() {
        String actual = RomanNumeralConverter.convert(8);
        Assertions.assertEquals("VIII", actual);
    }
}
