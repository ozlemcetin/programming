package org.example.chapter04;

import org.junit.jupiter.api.Test;

class EqualityPrinterTest {

    @Test
    void printEqual() {

        //printEqual(1, 1, 1); should print text All numbers are equal
        EqualityPrinter.printEqual(1, 1, 1);

        //printEqual(1, 2, 3); should print text All numbers are different
        EqualityPrinter.printEqual(1, 2, 3);

        //printEqual(1, 1, 2); should print text Neither all are equal or different
        EqualityPrinter.printEqual(1, 1, 2);

        //printEqual(-1, -1, -1); should print text Invalid Value
        EqualityPrinter.printEqual(-1, -1, -1);
    }
}