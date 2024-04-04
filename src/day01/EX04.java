package day01;

public class EX04 {
    public static void main(String[] args) {
        //1 ~11 사이에 있는 짝수만 출력하기
        for(int i=2; i<=11; i+=2){
            System.out.println(i);
        }

        int i=2;
        while(i<11){
            System.out.println(i);
            i+=2;
        }
    }
}
