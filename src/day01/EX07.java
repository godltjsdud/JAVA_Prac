package day01;

public class EX07 {
    public static void main(String[] args) {
        Notebook samsong = new Notebook("삼송");
        Notebook lg = new Notebook("엘지");

        System.out.println(samsong.brand);
        System.out.println(lg.brand);
    }

}

class Notebook{
    String brand;
    Notebook(){

    }
    Notebook(String brand){
        this.brand = brand;
    }
}
