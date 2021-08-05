package chapter8;

import chapter8.Calc;
import chapter8.CompleteCalc;

public class CalcTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;

        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

        calc.description(); // default 메소드(재정의 가능)
        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr)); // staic 메소드는 인터페이스 이름을 통해 호출
    }
}
