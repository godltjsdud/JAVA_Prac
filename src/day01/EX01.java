package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX01{
    //ㅈㅓㅁ수를 받는 변수,
    // 90점 이상 A
    // 80점 이상 B
    // 70점 이상 C
    // 나머지 : F

    public static void main(String[] args)  {
        int score = 87;

        if(score >= 90){
            System.out.println("A");
        }else if(score>=80){
            System.out.println("B");
        }else if(score>=70){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
    }

}
