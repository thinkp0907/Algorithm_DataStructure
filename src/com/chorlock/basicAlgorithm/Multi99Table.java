package com.chorlock.basicAlgorithm;

import java.util.Scanner;

public class Multi99Table {
    public static void main(String[] args) {
        System.out.println("-------곱셈표-------");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }

        example12();
        example13();
        example14();
    }

    static void example12() {
        System.out.printf("  |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
        System.out.printf("--+---------------------------\n");


        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d ", i*j);
            }
            System.out.println();
        }
    }
    static void example13() {
        System.out.printf("  |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
        System.out.printf("--+---------------------------\n");


        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d ", i+j);
            }
            System.out.println();
        }
    }

    private static void example14() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("사각형을 출력합니다.");
        System.out.print("단 수: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
