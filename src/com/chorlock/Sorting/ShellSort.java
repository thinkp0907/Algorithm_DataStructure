package com.chorlock.Sorting;

import java.util.Scanner;

public class ShellSort {
    static void shellSort(int[] a, int n) {
        int scnt = 0;
        int ccnt = 0;
        for (int h = n / 2; h > 0; h /= 2) {
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];

                ccnt++;
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                    scnt++;
                }
                a[j + h] = tmp;
            }
        }

        System.out.println("총 비교 횟수는 " + ccnt + "입니다.");
        System.out.println("총 교환 횟수는 " + scnt + "입니다.");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("셸 정렬(버전1)");
        System.out.printf("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.printf("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        shellSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
