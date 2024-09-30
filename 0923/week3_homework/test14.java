package week3_homework;

import java.util.Scanner;
;
public class test14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***** 겜블링 게임을 시작합니다 *****");
		int a, b, c;
		while(true) {
			System.out.print("엔터키를 입력>>");
			sc.nextLine();
			a = (int)(Math.random()*3);
			b = (int)(Math.random()*3);
			c = (int)(Math.random()*3);
			System.out.println(a+" "+b+" "+c);
			
			if(a == b &&  b == c && c == a) {
				System.out.println("성공! 대박났어요!");
				System.out.print("계속하시겠습니까?(yes/no)");
				String replay = sc.next();
				if(replay.equals("yes"))
					continue;
				else if(replay.equals("no")) {
					System.out.print("게임을 종료합니다.");
					break;
				}	
			}
		}
		sc.close();
	}
}
