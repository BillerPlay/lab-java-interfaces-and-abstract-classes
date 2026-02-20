package com.ironhack;

import java.math.RoundingMode;
import java.math.BigDecimal;

public class Main{
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("2.3");
        BigDecimal num2 = new BigDecimal("1.5");
        BigDecimal sum = num1.add(num2);
        BigDecimal subtract = num1.subtract(num2);
        BigDecimal multiply = num1.multiply(num2);
        BigDecimal divide = num1.divide(num2, 2, RoundingMode.HALF_UP);
        System.out.println(sum + " " + subtract + " " + multiply + " " +  divide);
        BigDecimal x = new BigDecimal("2.3");
        BigDecimal result = calculate(x);
        System.out.println(result);
    }

    public static BigDecimal calculate(BigDecimal x){
        BigDecimal num1 = new BigDecimal("2.3");
        BigDecimal num2 = new BigDecimal("1.5");
        BigDecimal num3 = new BigDecimal("0.8");
        BigDecimal all = num1.multiply(x);
        all = all.add(num2);
        BigDecimal denominator = x.subtract(num3);
        all=all.divide(denominator, 2 , RoundingMode.HALF_UP);
        return all;
    }
}
