package day02;

//생성자 오버로딩
public class EX03_2 {
    public static void main(String[] args) {
        Person dragon = new Person("010-1001-1000");
    }
}

class Person{
    String name;
    String phone;
    int age;

    Person(String phone){
        this.phone = phone;
    }
}