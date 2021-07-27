package chapter14;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] alpha = new char[26];
        char ch = 'A';

        for (int i = 0; i < alpha.length; i++){
            alpha[i] = ch++;
        }

        for (char alphabets : alpha){
            System.out.println(alphabets + ", " + (int)alphabets);
        }
    }

}
