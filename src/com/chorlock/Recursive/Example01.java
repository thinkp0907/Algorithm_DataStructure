package com.chorlock.Recursive;

import java.util.Scanner;

public class Example01 {

    static int factorial(int x) {
        int result = 1;

        if(x <= 0)
            return 1;
        else
            for (int i = 1; i <= x; i++) {
                result *= i;
            }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("정수를 입력하세요: ");
        int x = scanner.nextInt();

        int result = factorial(x);

        System.out.println(x + "의 팩토리얼은 " + result + "입니다.");

    }
}
