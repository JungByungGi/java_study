package chapter8;

public interface Calc {

    double PI = 3.14;
    int error = -999999;

    int add(int num, int num2);
    int substract(int num, int num2);
    int times(int num, int num2);
    int divide(int num, int num2);

    default void description(){
        System.out.println("정수 계산기를 제공합니다.");
        myMethod(); // private 메소드 호출
    }

    static int total(int[] arr){
        int total = 0;
        for(int num:arr){
            total += num;
        }
        myStaticMethod(); // private 메소드 호출
        return total;
    }

    /*private 메소드는 인터페이스 내에서만 사용 가능*/
    private void myMethod(){
        System.out.println("myMethod");
    }

    private static void myStaticMethod(){
        System.out.println("myStaticMethod");
    }
}
