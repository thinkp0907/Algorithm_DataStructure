package com.chorlock.Array;

import java.util.Random;
import java.util.Scanner;

public class example03 {
    static int sumOf(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();
        }

        int sum = sumOf(x);
        System.out.println("sum = " + sum);

    }
}
