package com.chorlock.Recursive;

import java.util.Scanner;

public class Example02 {
    static int gcd(int x, int y) {
        int tmp = 0;

        do {
            tmp = x % y;
            x = y;
            y = tmp;
        } while (y != 0);

        return x;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");
        System.out.printf("정수를 입력하세요: ");
        int x = scanner.nextInt();
        System.out.printf("정수를 입력하세요: ");
        int y = scanner.nextInt();


        System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");


    }
}
