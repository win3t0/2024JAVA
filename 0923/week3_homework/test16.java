package week3_homework;

import java.util.Scanner;

public class test16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요. -1은 입력 끝>>");
		int sum = 0;
		int count = 0;
		String input = sc.nextLine();
        String[] numbers = input.split(" ");

        for (String numStr : numbers) {
            try {
                int num = Integer.parseInt(numStr);
                if (num == -1) {
                    if (count > 0) 
                        System.out.println("평균: " + (double) sum / count);
                    sc.close();
                    return;
                } else if (num > 0) {
                    sum += num;
                    count++;
                }
            } catch (NumberFormatException e) {
                System.out.println(numStr + " 제외");
            }
        }
        sc.close();
    }
}
