package classReview;

public class Person {
    //멤버 변수
    public int height;
    public int weight;
    public int age;
    public String gender;
    public String name;

    //생성자
    public Person(int height, int weight, int age, String gender, String name){
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.name = name;
    }

    //메소드
    public void showInfo(){
        System.out.println("++++++++++++++++++++++++");
        System.out.println(String.format("이름 : %s", name));
        System.out.println(String.format("성별 : %s", gender));
        System.out.println(String.format("키 : %d", height));
        System.out.println(String.format("몸무게 : %d", weight));
        System.out.println(String.format("나이 : %d", age));
    }
}
