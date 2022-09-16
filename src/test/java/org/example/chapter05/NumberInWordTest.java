package org.example.chapter05;

import org.junit.jupiter.api.Test;

class NumberInWordTest {

    @Test
    void printNumberInWord() {

        NumberInWord.printNumberInWord(-1);
        NumberInWord.printNumberInWord(0);
        NumberInWord.printNumberInWord(7);
        NumberInWord.printNumberInWord(9);
        NumberInWord.printNumberInWord(10);
    }


}