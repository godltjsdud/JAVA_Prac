package day03;

public class EX01 {
    public static void main(String[] args) {
        // Cow, CHicken : cry() : "음메", "꼬끼오"
        // Farm : getSound() - cow, chicken.cry();
        // Animal : 상속 -오버라이딩

        Cow cow = new Cow();
        Chicken chicken = new Chicken();
        Farm farm = new Farm(cow, chicken);

        farm.getSound();
        farm.feed();
    }
}

class  Farm{
    Cow cow;
    Chicken chicken;
    Farm(Cow cow, Chicken chicken){
        this.cow = cow;
        this.chicken= chicken;
    }

    void getSound(){
        cow.cry();
        chicken.cry();
    }

    void feed(){
        cow.feed();
        chicken.feed();
    }
}

class Animal {
    Animal(){

    }

    void cry() {

    }


}

class Cow extends Animal{

    Cow(){
        super();
    }

    @Override
    void cry() {
        System.out.println("음메");
    }

    void feed(){
        System.out.println("먹이를 먹습니다");
    }
}

class Chicken extends Animal{
    Chicken(){
        super();
    }

    @Override
    void cry() {
        System.out.println("꼬끼오");
    }

    void feed(){
        System.out.println("먹이를 먹습니다");
    }
}
