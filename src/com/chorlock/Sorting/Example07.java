package com.chorlock.Sorting;

import java.util.Scanner;

public class Example07 {

    static void InsertionSort(int[] a, int n) {
        for (int i = 2; i < n; i++) {
            int tmp = a[0] = a[i];
            System.out.println(tmp + ", " + a[0] + ", " + a[i]);
            int j = i;
            for (; a[j - 1] > tmp; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
        System.out.printf("요솟수:");
        int nx = scanner.nextInt();
        int[] x = new int[nx + 1];

        for (int i = 1; i <= nx; i++) {
            System.out.printf("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        InsertionSort(x, nx + 1);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 1; i <= nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
