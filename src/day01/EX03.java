package day01;

public class EX03 {
    public static void main(String[] args) {
        int num = 29;

        switch (num/10){
            case 3:
                System.out.println("30대 입니다.");
                break;
            case 2:
                System.out.println("20대 입니다.");
                break;
            case 1:
                System.out.println("10대 입니다.");
                break;
            default:
                System.out.println("어린이 입니다.");
                break;
        }
    }
}
