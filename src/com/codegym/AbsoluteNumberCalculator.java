package com.codegym;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number) {
        boolean NUMBER = number < 0;
        if (NUMBER)
            return -number;
            return number;
    }
}
