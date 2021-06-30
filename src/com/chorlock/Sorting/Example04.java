package com.chorlock.Sorting;

import java.util.Scanner;

public class Example04 {

    static void swap(int[] a, int idx1, int idx2) { // a, 5, 6
        int t = a[idx1];            // t = a[5]
        a[idx1] = a[idx2];          // a[5] = a[6]
        a[idx2] = t;                // a[6] = t
    }

    static void bubbleSort(int[] a, int n) {
        int ccnt = 0;
        int scnt = 0;
        int k = 0;
        int pass = 0;
        while (k < n - 1) {
            int exchg = 0;
            int last = 0;
            System.out.println("패스" + ++pass );
            for (int j = n - 1; j > k; j--) {
                for (int m = 0; m < n - 1; m++)
                    System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
                System.out.printf("%3d\n", a[n - 1]);

                ccnt++;
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    scnt++;
                    exchg++;
                    last = j;
                }
            }
            if (exchg == 0) break;
            k = last;
        }
        System.out.println("비교를 " + ccnt + "회 했습니다");
        System.out.println("교환를 " + scnt + "회 했습니다");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("버블 정렬(버전2)");
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
            System.out.println("x[" + i + "]=" + x[i]);
        }


    }
}
