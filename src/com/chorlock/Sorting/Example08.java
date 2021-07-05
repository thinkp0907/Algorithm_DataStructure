package com.chorlock.Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Example08 {

    static int binarySearch(int[] a, int start, int end, int find) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] <= find) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    // 6 4 8 3 1 9 7
    // 4 6 8 3 1 9 7
    // 3 4 6 8 1 9 7    start = 0, end = 1;
    //
    static void InsertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int tmp = a[i];
            int position = binarySearch(a, 0, i - 1, tmp);
            System.out.println(position);
            int j=i;

            for (; j > position; j--) {
                a[j] = a[j-1];
            }
            a[position]= tmp;
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

        InsertionSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
