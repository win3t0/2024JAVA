package sanner;

import java.util.Scanner;

public class scanner1 {
	public static void main(String[] args) {
		int dollar = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("$1=1200원입니다. 달러를 입력하세요>>>");
		dollar = sc.nextInt();
		
		System.out.println("$" + dollar + "는 " + dollar * 1200 + "원입니다.");
		sc.close();
	}
}
