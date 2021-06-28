package com.chorlock.Sorting;

import java.util.Scanner;

public class Example02 {
    static void swap02(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSorting(int[] a, int n) {
        int ccnt = 0;
        int ecnt = 0;
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("패스%d：\n", i + 1);
            for (int j = n - 1; j > i; j--) {
                for (int m = 0; m < n - 1; m++)
                    System.out.printf("%3d %c", a[m], (m != j - 1) ?  ' ': (a[j - 1] > a[j]) ? '+' : '-');
                System.out.printf("%3d\n", a[n - 1]);

                ccnt++;
                if (a[j - 1] > a[j]) {
                    swap02(a, j - 1, j);
                    ecnt++;
                }
            }
            for (int m = 0; m < n; m++)
                System.out.printf("%3d  ", a[m]);
            System.out.println();
        }

        System.out.println("비교를 " + ccnt + "회 했습니다.");
        System.out.println("교환을 " + ecnt + "회 했습니다.");
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
