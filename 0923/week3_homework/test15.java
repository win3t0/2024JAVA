package week3_homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;
        
        while(true) {
            try {
                System.out.print("곱하고자 하는 정수 2개 입력>> ");
                n = sc.nextInt();
                m = sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("정수를 입력하세요");
                sc.nextLine();
                continue;
            }
            break;
        }
        
        System.out.println(n + "x" + m + "=" + n * m);
        sc.close();
    }
}
