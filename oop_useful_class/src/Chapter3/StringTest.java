package Chapter3;

public class StringTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");
        System.out.println(System.identityHashCode(java));
        java = java.concat(android); // 새로운 문자열로 생성

        System.out.println(java);
        System.out.println(System.identityHashCode(java));
    }
}
