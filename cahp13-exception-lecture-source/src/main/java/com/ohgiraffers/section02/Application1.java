package com.ohgiraffers.section02;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /*
         * 사용자 정의의 예외클래스
         *
         * RuntimeException의 후손 대부분은 예외처리를 강제화하지 않음.
         * 이런경우에도 예외를 강제화 하고싶을때는 사전에 정의된 예외클래스 외에 개발자가 원하는 명칭의 예외클래스를 만들어 작성할 수 있다.
         */

        Scanner sc = new Scanner(System.in);
        ExceptionTest et = new ExceptionTest();
        System.out.print("물건의 가격을 입력해주세요 : ");
        int price = sc.nextInt();
        System.out.print("보유금을 입력해주세요 : ");
        int money = sc.nextInt();
        try {
            et.checkEnoughMoney(price, money);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
