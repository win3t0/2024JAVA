package sanner;

import java.util.Scanner;

public class scanner3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gimbab = 0;
		int tteokbokki = 0;
		int Jjolmyeon = 0;
		
		System.out.print("떡볶이 몇 인분>>");
		tteokbokki = sc.nextInt();
		
		System.out.print("김밥 몇 인분>>");
		gimbab = sc.nextInt();
		
		System.out.print("쫄면 몇 인분>>");
		Jjolmyeon = sc.nextInt();
		
		System.out.println("전체 금액은 "+ ((tteokbokki*2000)+(gimbab*1000)+(Jjolmyeon*3000)) +"원입니다.");
		sc.close();
	}
}
