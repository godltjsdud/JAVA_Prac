package day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX02 {
    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

//        switch (num){
//            case 9:
//                System.out.println("A");
//                break;
//            case 8:
//                System.out.println("B");
//                break;
//            case 7:
//                System.out.println("C");
//                break;
//            default:
//                System.out.println("F");
//                break;
//        }

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
