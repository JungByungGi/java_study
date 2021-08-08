package chapter2;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student a = new Student(100, "Lee");
        Student b = new Student(100, "Lee");
        Student c = a;

        System.out.println(a==c);
        System.out.println(a==b); // false
        System.out.println(a.equals(b)); // 재정의를 통해 true

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Student copyStd = (Student)a.clone(); // 인스턴스 상태를 그대로 복제
        System.out.println(copyStd.toString()); // Cloneable implements를 해야 됨.

//        String str1 = new String("abc");
//        String str2 = new String("abc");
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());
    }
}
