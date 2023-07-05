package com.recursion.eg;

public class GreatestCmDivisor {
    public int greatestCommonDv(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return greatestCommonDv(b, a % b);
        }
    }


}
