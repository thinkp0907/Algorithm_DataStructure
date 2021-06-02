package com.chorlock.basicAlgorithm;

import java.util.Arrays;
import java.util.Scanner;



public class SumFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");
        do {
            System.out.print("n의 값: ");
            n = scanner.nextInt();
        } while (n <= 0);


        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("1부터 " + n + " 까지의 합은 " + sum + "입니다.");

//        bigger();
        numberOfNumber();
//        N_7();
//        System.out.println();
//        Gauss();
//        int answer = sumof(10, 5);
//        System.out.println("answer = " + answer);
    }
    public static void N_7() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n의 값: ");
        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i<=n; i++) {
            sum += i;
            if(i != n){
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = " + sum);
            }
        }
    }

    public static void Gauss() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n의 값: ");
        int n = scanner.nextInt();
        int sum = 0;

        if (n % 2 == 0) {
            // 500 250
            sum = (n + 1) * (n / 2);
            System.out.println("1부터 " + n + " 까지의 합은 = " + sum);
        } else {
            sum = (n + 1) * (n % 2) + ((n + 1) / 2);
            System.out.println("1부터 " + n + " 까지의 합은 = " + sum);
        }
    }

    static int sumof(int a, int b) {
        int sum = 0;
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        return sum;
    }

    static void bigger() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a의 값: ");
        int a = scanner.nextInt();
        System.out.print("b의 값: ");
        int b = scanner.nextInt();
        if(a<b) {
            System.out.println("b-a는 = " + (b-a) + " 입니다.");
        } else {
            do {
                System.out.println("a보다 큰 값을 입력하세요!");
                System.out.print("b의 값: ");
                b = scanner.nextInt();
            } while (a < b);
        }
    }

    static void numberOfNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("양의 정수를 입력하세요: ");
        int a = scanner.nextInt();
        String num = String.valueOf(a);
        System.out.println("그 수는 " + num.length() + "자리입니다.");

    }
}
