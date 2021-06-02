package com.chorlock.basicAlgorithm;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까?: ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

//        triangleLB(10);
        triangleLU(10);
        triangleRU(10);
        triangleRB(10);
        spira(10);
        npira(10);
    }

    private static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= (i - 1) * 2 + 1; k++) {
                System.out.printf("%d", i%10);
            }
            System.out.println();
        }
    }

    private static void spira(int n) {
        for (int i = 1; i <= n; i++) {      // 행
            for (int j = i; j <= n; j++) {  // 열
                System.out.printf(" ");
            }
            for (int k = 1; k <= (i - 1) * 2 + 1; k++) {    // 열
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    private static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }

    private static void triangleRU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.printf("*");
            }
            System.out.println();
            for (int k = 1; k <= i; k++) {
                System.out.printf(" ");
            }
        }
        System.out.println();
    }

    private static void triangleLU(int n) {
        for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.printf("*");
                }
                System.out.println();
        }
    }

    private static void triangleLB(int n) {
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
