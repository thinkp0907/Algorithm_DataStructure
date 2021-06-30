package com.chorlock.Sorting;

import java.util.Scanner;

public class InsertionSort {
    // 단순 삽입 정렬
    static void insertionSort(int[] a, int n) {
        // 22, 5, 11, 32, 120, 68, 70
        for (int i = 1; i < n; i++) {
            int j;
            int tmp = a[i]; // tmp = 5
            for (j = i; j > 0 && a[j - 1] > tmp; j--) {
                // j = 1, 5자리에 22를 넣어라
                a[j] = a[j - 1];
                System.out.println("for문 안에 a["+j+"] " + a[j]);
            }
            a[j] = tmp;
            System.out.println("for문 밖에 a["+j+"] " + a[j]);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
        System.out.printf("요솟수:");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.printf("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        insertionSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
