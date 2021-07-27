package chapter10;

public class Person {
    String name;
    int age;

    //매개 변수가 없는 생성자
    public Person(){
        this("no name", 10); // 매개 변수가 없는 생성자에서 this() 구문이 반드시 함수 내에서 첫 구문이어야 한다.
        this.name = "aa";
        this.age = 15;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showPerson(){
        System.out.println(name + ", " + age);
    }

    public Person getPerson(){
        return this;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson();
        //this는 자신의 주소를 반환한다.
        System.out.println(person);
        Person person2 = person.getPerson();
        System.out.println(person2);
    }
}
