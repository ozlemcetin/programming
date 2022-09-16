package org.example.chapter05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPalindromeTest {

    @Test
    void isPalindrome() {

        //should return true
        assertTrue(NumberPalindrome.isPalindrome(-1221));

        //should return true
        assertTrue(NumberPalindrome.isPalindrome(707));

        //should return false because reverse is 21211 and that is not equal to 11212.
        assertFalse(NumberPalindrome.isPalindrome(11212));
    }

    @Test
    void reverseNumber() {

        assertEquals(NumberPalindrome.reverseNumber(34567), 76543);
        assertEquals(NumberPalindrome.reverseNumber(-1221), -1221);
    }
}