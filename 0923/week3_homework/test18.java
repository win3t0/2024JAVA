package week3_homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10명 학생의 학번과 점수 입력");
		int [] student = new int [10];
		int [] score = new int [10];
		
		for(int i=0; i<10; i++) {
			System.out.print((i+1) + ">>");
			student[i] = sc.nextInt();
			score[i] = sc.nextInt();
		}
		int find_student = 0;
		int find_score = 0;
		
		while(true) {
			System.out.print("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3>>");
			
			int answer = sc.nextInt();
			if(answer == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(answer == 1) {
				System.out.print("학번은>>");
				try {
				find_student = sc.nextInt();
				}
				catch (InputMismatchException e) {
					System.out.println("경고!! 정수를 입력하세요");
					sc.nextLine();
					continue;
				}
				for (int i = 0; i < student.length; i++) {
					if(student[i] == find_student) {
						System.out.println(score[i] + "점");
						break;
					}
					
					if(i ==  student.length-1)
						System.out.println(find_student + "학생은 없습니다");
						
				}
			}
			else if(answer == 2) {
				int finded = 0;
				System.out.print("점수은>>");
				try {
				find_score = sc.nextInt();
				}
				catch (InputMismatchException e) {
					System.out.println("경고!! 정수를 입력하세요");
					sc.nextLine();
					continue;
				}
				System.out.print("점수가 " + find_score + "인 학생은 ");
				for (int i = 0; i < score.length; i++) {
					if(score[i] == find_score) {
						System.out.print(score[i] + " ");
						finded = 1;
					}
				}
				if(finded == 1)
					System.out.println("입니다.");
				else
					System.out.println("없습니다.");
			}
			else {
				System.out.println("해당없음");
			}
		}
		sc.close();
	}
}
