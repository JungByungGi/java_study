package chapter2;

public class AddTest {
    public static void main(String[] args) {

        Add addL = (x,y) -> {return x+y;}; // 인터페이스에 있는 함수 구현
        Add addL2 = ((x, y) -> {return x-y;});
        System.out.println(addL2.add(2,3));
    }
}
