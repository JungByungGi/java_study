package chapter2;

public class Student implements Cloneable{
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName){
        this.studentName = studentName;
        this.studentNum = studentNum;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString(){
        return studentNum + "," + studentName;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            Student std = (Student)obj; // 다운 캐스팅
            if (this.studentName == std.studentName)
                return true;
            else
                return false;
       }
        return false;
    }
}
