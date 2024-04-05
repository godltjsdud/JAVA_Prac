package day03;

public class EX03 {
    public static void main(String[] args) {
        //class Garden
        //class Dog, Cat extends Pet
        //getSound(동물)
        //cry();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Garden garden = new Garden(cat,dog);

        System.out.println(args[0] + args[1]);
        garden.getSound(cat);
        garden.getSound(dog);
    }
}

class Garden{
    Cat cat;
    Dog dog;

    Garden(Cat cat, Dog dog){
        this.cat = cat;
        this.dog = dog;
    }

    void getSound(Pet pet){
        pet.cry();
    }
}

class Pet{

    void cry(){

    }

}

class Dog extends Pet{
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

class Cat extends Pet{
    @Override
    void cry() {
        System.out.println("야옹");
    }
}
