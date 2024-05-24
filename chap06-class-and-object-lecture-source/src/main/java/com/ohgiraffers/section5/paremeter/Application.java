package com.ohgiraffers.section5.paremeter;

public class Application {
    public static void main(String[] args) {

        // 메소드의 파라미터(매개변수)

        /*
         * 매개변수로 사용가능한 자료형
         * 1. 기본자료형
         * 2. 기본자료형 배열
         * 3. 클래스자료형
         * 4. 클래스자료형 배열
         * 5. 가변인자
         */

        ParameterTest pt = new ParameterTest();

        // 기본자료형을 매개변수로 전달받는 메소드 호출 확인
        int num = 20;
        pt.testPrimaryTypeParameter(num);

        // 기본자료형 배열을 매개변수로 전달받는 메소드 호출 확인
        int[] iarr = new int[]{1, 2, 3, 4, 5};
        System.out.println("인자로 전달하는 값 : " + iarr);
        pt.testPrimaryTypeArrayParameter(iarr);

        System.out.print("변경후 원본 배열의 값 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println("\n");

        // 클래스 자료형
        Rectangle r1 = new Rectangle(12.5, 22.5);
        System.out.println("인자로 전달하는 값 : " + r1);
        pt.testClassTypeParameter(r1);

        System.out.println("========== 변경 후 원본 사각형의 넓이와 둘레 ==========");
        r1.calcArea();   // 넓이 출력
        r1.calcRound();  // 둘레 출력
        System.out.println();

        // 가변 인자
//        pt.testVariableLengthArrayParameter();
        pt.testVariableLengthArrayParameter("홍길동"); // 가변인자는 값이 없어도 괜찮음
        System.out.println();
        pt.testVariableLengthArrayParameter("홍길동", "볼링");   // 1개 가능
        System.out.println();
        pt.testVariableLengthArrayParameter("홍길동", "볼링", "당구");
        System.out.println();
        pt.testVariableLengthArrayParameter("홍길동", new String[] {"테니스", "서예"}); // 배열도 가능
    }
}
