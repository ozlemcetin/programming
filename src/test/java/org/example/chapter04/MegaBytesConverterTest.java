package org.example.chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MegaBytesConverterTest {

    @Test
    void printMegaBytesAndKiloBytes() {
        /*
            when the parameter kiloBytes is 2500
            it needs to print "2500 KB = 2 MB and 452 KB"
         */
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        /*
            If the parameter kiloBytes is less than 0
            then print the text "Invalid Value".
         */
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);

        //"5000 KB = 4 MB and 904 KB"
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    }

}