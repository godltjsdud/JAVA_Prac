package day01;

public class EX05 {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.name);
        Computer computer = new Computer();

    }
}

// 도서 클래스

class Product { // 하나의 파일안에 클래스를 여러개 만들 수는 있지만, public 을 붙이려면 파일명과 클래스명이 같아야함.
    // 생략 = 이걸로 어떻게 객체를 만들 수 있는지
    // 생성자 = 클래스로 객체를 만들 수 있는 방법
    String name = "해리포터";
    String author;
    int price;

   Product(){ // 기본 생성자

    }
    Product(String name, String author, int price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
}

//컴퓨터 클래스
class Computer{
    String company;
    String model;

    Computer(){

    }

    Computer(String company, String model){
        this.company = company;
        this.model = model;
    }


}
