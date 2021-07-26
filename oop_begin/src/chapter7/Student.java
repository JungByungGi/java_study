package chapter7;

public class Student {

    //기본 자료형
    public int studentID; //학번
    public String studentName; //학생 이름

    Subject korean;
    Subject math;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        korean = new Subject();
        math = new Subject();
    }

    public void setKorean(String name, int score){
        korean.subjectName = name;
        korean.subjectScore = score;
    }

    public void setMath(String name, int score){
        math.subjectName = name;
        math.subjectScore = score;
    }

    public void showScoreInfo(){
        int total = korean.subjectScore + math.subjectScore;
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }
}