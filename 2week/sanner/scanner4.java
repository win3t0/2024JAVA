package sanner;

import java.util.Scanner;

public class scanner4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int people = 0;
		int day = 0;
		String travel;
		int house = 0;
		int airplane = 0;
		
		System.out.print("여행지>>");
		travel = sc.nextLine();
		System.out.print("인원수>>");
		people = sc.nextInt();
		System.out.print("숙박일");
		day = sc.nextInt();
		System.out.print("1인당 항공료");
		airplane = sc.nextInt();
		System.out.print("1방 숙박비");
		house= sc.nextInt();
		
		System.out.println(people + "명의 " + travel + " " + day + "박 " + (day+1) + 
				"일 여행에는 방이 " + ((people/2)+(people%2)) + "개 필요하며 경비는 " +
				((people/2+people%2)*house + people * airplane) + "원입니다."
				);
		sc.close();
	}
}
