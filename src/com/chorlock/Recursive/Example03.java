package com.chorlock.Recursive;

import java.util.Scanner;

public class Example03 {

    static int gcd(int x, int y) {

        while (y != 0) {
            int tmp = y;
            y = x % y;
            x = tmp;
        }
        return x;
    }

    static int gcdArray(int[] a) {
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열에 있는 요소들의 최대공약수를 구합니다.");
        System.out.printf("요솟수: ");
        int num;
        do {
            num = scanner.nextInt();
        } while(num <= 1);

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("x["+i+"]: ");
            x[i] = scanner.nextInt();
        }


        System.out.println("최대공약수는 " + gcdArray(x) + "입니다.");


    }
}
