package com.chorlock.Sorting;

import java.util.Scanner;

public class QuickSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    // 퀵 정렬
    static void quickSort(int[] a, int left, int right) {   // a, 0, 8
        int pl = left;              // 왼쪽 커서    0
        int pr = right;             // 오른쪽 커서   1
        int x = a[(pl + pr)/2];     // 피벗          0

        System.out.printf("a[%d]~a[%d] : { ", left, right);
        for (int i = left; i < right; i++)
            System.out.printf("%d , " , a[i]);
        System.out.printf("%d}\n", a[right]);


        do {
            while(a[pl] < x) pl++;
            while(a[pr] > x) pr--;
            if(pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        // 0 < 1
        if (left < pr) quickSort(a, left, pr);  // a, 0, 1
        // 6 8 9 7
        if (pl < right) quickSort(a, pl, right); // a,
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("퀵 정렬");
        System.out.printf("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.printf("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        quickSort(x, 0, nx - 1);

        System.out.println("오른차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
