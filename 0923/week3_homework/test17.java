package week3_homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coffee[] = {"핫아메리카노", "아이스아메리카노", "카푸치노", "라떼"};
        int price[] = {3000, 3500, 4000, 5000};
        System.out.println("핫아메리카노, 아이스아메리카노, 카푸치노, 라떼 있습니다.");
        
        String menu = " ";
        int cups = 0;
        int coffee_price = 0;
        
        while(true) {
            coffee_price = 0;
            System.out.print("주문>> ");
            menu = sc.next();

            if(menu.equals("그만")) {
                break;
            }

            for (int i = 0; i < coffee.length; i++) {
                if(coffee[i].equals(menu)) {
                    coffee_price = price[i];
                    break;
                }
            }

            if(coffee_price == 0) {
                System.out.println(menu + "은 없는 메뉴입니다.");
                continue;
            }

            try {
                cups = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잔 수는 양의 정수로 입력해주세요.");
                sc.nextLine();
                continue;
            }

            System.out.println("가격은 " + (coffee_price * cups) + "원입니다.");
        }
        
        sc.close();
    }
}
