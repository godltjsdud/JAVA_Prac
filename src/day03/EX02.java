package day03;

public class EX02 {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();

        Parent parent2 = new Child();
        parent2.method();
    }
}

class Parent{
    void method(){
        System.out.println("부모입니다.");
    }
}

class Child extends Parent{
    void method(){
        System.out.println("자식입니다.");
    }
}
