package chapter7;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        studentLee.setKorean("국어", 100);
        studentLee.setMath("수학", 99);

        Student studentJung = new Student(200, "Jung");
        studentJung.setKorean("국어", 90);
        studentJung.setMath("수학", 80);

        studentLee.showScoreInfo();
        studentJung.showScoreInfo();
    }
}
