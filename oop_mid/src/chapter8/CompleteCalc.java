package chapter8;

import chapter8.Calculator;

public class CompleteCalc extends Calculator {
    @Override
    public int times(int num1, int num2){
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2){
        if (num2 == 0)
            return error;

        return num1 / num2;
    }
    
//    @Override // 디폴트 메소드는 재정의 가능
//    public void description(){
//        System.out.println("정수 계산기 재정의");
//    }
    
    public void showInfo(){
        System.out.println("모두 구현 완료");
    }
}
