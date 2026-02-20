package com.ironhack;

import java.math.RoundingMode;
import java.math.BigDecimal;

public class Main{
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("1.2345");
        double result1 = roundedToHundredth(number1);
        System.out.println(result1);

        BigDecimal result2 = reverseAndRound(number1);
        System.out.println(result2);

    }
    public static double roundedToHundredth(BigDecimal number){
        if (number == null) {
            return 0.0;
        }
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal reverseAndRound (BigDecimal number){
        if (number == null) {
            return null;
        }
        return number.negate().setScale(1, RoundingMode.HALF_UP);
    }
}
