package day02;

public class EX04 {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        taxi.ride();
    }


}

class Car {
    int wheels = 1;
    void ride(){
        System.out.println("와아아아앙");
    }

    void getWheelNum(){
        System.out.println("바퀴 수는 "+ wheels + "개 입니다.");
    }
}

//버스
class Bus extends Car {
    int wheels = 4;
    void ride(){
        System.out.println("부릉부릉");
    }

    void getWheelNum(){
        System.out.println("바퀴 수는 "+ wheels + "개 입니다.");
    }
}

//택시
class Taxi extends Car {
    int wheels = 4;
//    void ride(){
//        System.out.println("빵빵");
//    }
//
//    void getWheelNum(){
//        System.out.println("바퀴 수는 "+ wheels + "개 입니다.");
//    }
}
