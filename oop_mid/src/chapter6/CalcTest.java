package chapter6;

import java.awt.event.ComponentListener;

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new CompleteCalc();
        int num1 = 10;
        int num2 = 12;
        int num3 = 0;
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));
        System.out.println(calc.divide(num1, num3));


    }
}
