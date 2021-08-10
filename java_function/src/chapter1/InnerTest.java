package chapter1;

class Outclass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public Outclass(){
        inClass = new InClass();
    }

    private class InClass{
        int iNum = 100;

        //static int sInNum = 500; // 오류 :
        void inTest(){
            System.out.println("Outclass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("Outclass num = " + sNum + "(외부 클래스의 static 변수)");
            System.out.println("Outclass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
        }
    }

    static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;

        void inTest(){
            System.out.println("Inclass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("Outclass num = " + sNum + "(외부 클래스의 static 변수)");
            System.out.println("Inclass num = " + sInNum + "(내부 클래스의 static 변수)");
        }

        static void sTest(){
            System.out.println("Outclass num = " + sNum + "(외부 클래스의 static 변수)");
            System.out.println("Inclass num = " + sInNum + "(내부 클래스의 static 변수)");
        }
    }

    public void usingClass(){
        inClass.inTest();
    }
}
public class InnerTest {
    public static void main(String[] args) {
        Outclass outclass = new Outclass();
        outclass.usingClass();

        Outclass.InStaticClass sInClass = new Outclass.InStaticClass();
        sInClass.inTest();
        System.out.println();

        Outclass.InStaticClass.sTest();
    }
}
