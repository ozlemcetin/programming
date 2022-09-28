package org.example.chapter05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalStarTest {

    @Test
    void printSquareStar() {

        DiagonalStar.printSquareStar(6);
        DiagonalStar.printSquareStar(7);
        DiagonalStar.printSquareStar(8);
        DiagonalStar.printSquareStar(9);
    }
}