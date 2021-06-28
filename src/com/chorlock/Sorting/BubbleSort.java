package com.chorlock.Sorting;

import java.util.Scanner;

public class BubbleSort {

    static void swap(int[] a, int idx1, int idx2) { // a, 5, 6
        int t = a[idx1];            // t = a[5]
        a[idx1] = a[idx2];          // a[5] = a[6]
        a[idx2] = t;                // a[6] = t
    }

    // 버블 정렬
    static void bubbleSort(int[] a, int n) {        // a = int[7], n = 7;
        for (int i = 0; i < n - 1; i++) {           // 0
            for (int j = n - 1; j > i; j--) {       // j = 6 5 4 3 2 1
                if (a[j - 1] > a[j]) {              // a[5] > a[6]?
                    swap(a, j - 1, j);         // 그러면 swap(a, j-1, j
                }
            }
        }
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

        bubbleSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x["+i+"]="+x[i]);
        }
    }



}
