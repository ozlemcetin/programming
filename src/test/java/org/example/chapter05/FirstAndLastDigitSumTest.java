package org.example.chapter05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstAndLastDigitSumTest {

    @Test
    void sumFirstAndLastDigit() {

        //should return -1, since the parameter is negative and needs to be positive.
        Assertions.assertEquals(FirstAndLastDigitSum.sumFirstAndLastDigit(5), 10);

        //should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
        Assertions.assertEquals(FirstAndLastDigitSum.sumFirstAndLastDigit(-10), -1);

        Assertions.assertEquals(FirstAndLastDigitSum.sumFirstAndLastDigit(10), 1);

        //should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
        Assertions.assertEquals(FirstAndLastDigitSum.sumFirstAndLastDigit(252), 4);

        //should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
        Assertions.assertEquals(FirstAndLastDigitSum.sumFirstAndLastDigit(257), 9);

        //should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
        Assertions.assertEquals(FirstAndLastDigitSum.sumFirstAndLastDigit(0), 0);
    }
}