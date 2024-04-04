package day02;

public class EX02 {
    public static void main(String[] args) {
        Phone son = new SamsungPhone("쏘니");
        Phone beckem = new ApplePhone("베컴");


        son.setSound();
        son.turnOn();

        beckem.setSound();
        beckem.turnOn();

    }
}

class Phone{
    String owner;
    String sound;
    String model;

    Phone(){

    }

    Phone(String owner){
        this.owner = owner;
        System.out.println(getOwner() + "가 핸드폰을 샀습니다.");
    }

    void turnOn(){
        if(getModel().equals("Apple")){
            System.out.println("turn on");
        }else if(getModel().equals("Samsung")){
            System.out.println("야 내 핸드폰 켜볼게");
        }

        System.out.println(getSound());
    }

    void setSound(){
        if(getModel().equals("Apple")){
            this.sound = "bbeep";
        }else if(getModel().equals("Samsung")){
            this.sound = "삐비빅";
        }
    }

    void setModel(String model){
        this.model = model;
    }

    String getModel(){
        return model;
    }

    String getSound(){
        return sound;
    }

    String getOwner(){
        return owner;
    }


}


class SamsungPhone extends Phone{

    SamsungPhone(){
        super();
    }

    SamsungPhone(String owner){
        super(owner);
        setModel("Samsung");
    }

}

class ApplePhone extends Phone{
    String model = "Apple";
    ApplePhone(){
        super();
    }

    ApplePhone(String owner){
        super(owner);
        setModel("Apple");
    }

}