package day02;

public class EX02 {
    public static void main(String[] args) {
        Phone son = new Phone("쏘니");
        Phone beckem = new Phone("베컴");
        son.setLan("kor");
        beckem.setLan("eng");

        son.setSound();
        son.turnOn();

        beckem.setSound();
        beckem.turnOn();

    }
}

class Phone{
    String owner;
    String sound;
    String lan;

    Phone(){

    }

    Phone(String owner){
        this.owner = owner;
        System.out.println(getOwner() + "가 핸드폰을 샀습니다.");
    }

    void turnOn(){
        if(getLan().equals("eng")){
            System.out.println("turn on");
        }else{
            System.out.println("야 내 핸드폰 켜볼게");
        }

        System.out.println(getSound());
    }

    void setSound(){
        if(getLan().equals("eng")){
            this.sound = "bbeep";
        }else{
            this.sound = "삐비빅";
        }
    }

    void setLan(String lan){
        this.lan = lan;
    }

    String getLan(){
        return lan;
    }

    String getSound(){
        return sound;
    }

    String getOwner(){
        return owner;
    }


}