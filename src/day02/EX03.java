package day02;

public class EX03 {
    public static void main(String[] args) {
        Barita chunsik = new Barita("춘식");
        chunsik.getCoffeeInfo();
        chunsik.makeCoffee();
    }
}

class Barita{
    private String name;
    private int price = 4500;
    Barita(){

    }

    Barita(String name){
        this.name = name;
    }

    void getCoffeeInfo(){
        System.out.println("이 커피는 "+ price + "원입니다.");
    }

    void makeCoffee(){
        System.out.println("커피 여기 있습니다~");
    }

}
