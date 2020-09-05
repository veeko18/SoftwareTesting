package com.sda.jt10.advancedtesting;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.xml.sax.SAXException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.extractProperty;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {
    Calculator testCalculator = new Calculator();

    @Test
    public void given_two_numbers_return_sum() {
        int a = 10;
        int b = 5;

        assertEquals(testCalculator.add(a, b), 15);
    }

    @Test
    public void given_two_numbers_return_division() {
        int a = 81;
        int b = 3;

        assertThat(testCalculator.divide(a, b)).isEqualTo(27);
    }


    @Test
    public void given_dividend_zero_should_throw_exception() {
        int a = 7;
        int b = 0;

        assertThrows(
                ArithmeticException.class,
                () -> testCalculator.divide(a, b));
    }


    @Rule
    ExpectedException exception = ExpectedException.none();

    @Test
    public void given_dividend_zero_should_throw_exception_using_rule() {
        exception.expect(ArithmeticException.class);
        exception.expectMessage("/ by zero");
    }


    class Calculator {

        public int add(int a, int b) {
            return a + b;
        }

        public double divide(int a, int b) {

            return a / b;

        }
    }
}
