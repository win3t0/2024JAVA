package sanner;

import java.util.Scanner;

public class scanner2 {
	public static void main(String[] args) {
		int birth = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생일을 입력 하세요>>>");
		birth = sc.nextInt();
		
		System.out.println(birth/10000 + "년 " + (birth%1000)/100 +"월 " + (birth%100) +"일");
		sc.close();
	}
}
