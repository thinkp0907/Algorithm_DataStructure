package com.chorlock.Sorting;

import java.util.Scanner;

public class Example01 {
    static void swap01(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSorting(int[] a, int n) {
        for(int i=0; i < n - 1; i++)
            for(int j=0; j < n - 1; j++)
                if(a[j] > a[j + 1])
                    swap01(a, j, j+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("버블 정렬(버전1)");
        System.out.printf("요솟수:");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.printf("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        bubbleSorting(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x["+i+"]="+x[i]);
        }
    }
}
