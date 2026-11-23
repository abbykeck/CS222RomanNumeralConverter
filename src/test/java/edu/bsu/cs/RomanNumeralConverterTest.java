package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {
    @Test
    public void testConvertOne() {
        String actual = RomanNumeralConverter.convert(1);
        Assertions.assertEquals("I", actual);
    }
}
