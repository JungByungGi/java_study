package chapter6;

// 클래스 객체의 인스턴스를 생성해서 테스트하는 클래스
// 인스턴스 : 클래스로부터 생성된 객체(힙 메모리에 멤버 변수의 크기에 따라 메모리가 생성)
public class StudentTest {
    public static void main(String[] args){
//        Student student1 = new Student(); // 생성자(인스턴스 생성) : student1이 stack 메모리에 생성되고 생성자로 인해 실체화되어 인스턴스가 되면 heap 영역에 저장된다.
//        student1.studentName = "정병기";
//        student1.address = "수원";
//        student1.showStudentInfo();
//
//        Student student2 = new Student(); // 생성자(인스턴스 생성)
//        student2.studentName = "홀길동";
//        student2.address = "서울";
//        student2.showStudentInfo();

        Student student1 = new Student(2015104218, "정병기", 4);
        System.out.println(student1.showStudentInfo());
    }
}
