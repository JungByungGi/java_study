package chapter4;

public class StringConcatTest {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";
        StringConcatImpl concat1 = new StringConcatImpl();
        concat1.makeString(s1, s2);

        StringConcat concat = (s,v)->System.out.println(s+ "," +v);
        concat.makeString(s1, s2);
    }
}
