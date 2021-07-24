package chapter6;

//java 파일 하나에 여러 개의 class가 있을 수는 있지만 public class는 java 파일 안에 하나만 있어야 하며 java 파일 이름과 동일해야 함.
public class Student {
    //멤버 변수
    public int studentID; // public : 접근 제어자
    public String studentName;
    public int grade;
//    public String address;
//
//    //메서드(return x) : 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수(클라이언트 코드에 맞게 변수명을 지정하는 게 좋음)
//    public void showStudentInfo(){
//        System.out.println(studentName + "," + address);
//    }

    public Student(int studentID, String studentName, int grade){
        this.studentID = studentID;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo(){

        return studentName + "학생의 학번은 " + studentID + "이고 " + grade + "학년입니다.";
    }
}

/*
<메모리>
함수 호출 시 사용되는 메모리 : stack 메모리(LIFO) -> 호출이 끝나면 메모리에서 사라짐
*/