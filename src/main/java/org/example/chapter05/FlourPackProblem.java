package org.example.chapter05;

public class FlourPackProblem {

    /*
    Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.

    The parameter bigCount represents the count of big flour bags (5 kilos each).

    The parameter smallCount represents the count of small flour bags (1 kilo each).

    The parameter goal represents the goal amount of kilos of flour needed to assemble a package.

    Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
    The method should return true if it is possible to make a package with goal kilos of flour.
     */

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        if (((bigCount * 5) + smallCount) < goal) return false;

        while (goal >= 5 && bigCount > 0) {
            goal -= 5;
            bigCount--;
        }

        while (goal >= 1 && smallCount > 0) {
            goal -= 1;
            smallCount--;
        }

        return (goal == 0);
    }
}
