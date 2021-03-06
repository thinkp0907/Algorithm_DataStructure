package com.chorlock.Sorting;

import java.util.Scanner;

public class ShellSort2 {
    static int shellSort(int[] a, int n) {
        int count = 0; // 옮김 횟수
        int h;
        for (h = 1; h < n / 9; h = h * 3 + 1)
            ;

        for (; h > 0; h /= 3)
            for (int i = h; i < n; i++) {
                System.out.println(i);
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                    count++;
                }
                a[j + h] = tmp;
                count++;
            }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("셸 정렬(버전2)");
        System.out.printf("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.printf("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }


        int count = shellSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
        System.out.println("요소의 옮김횟수는 " + count + "회입니다.");
    }
}
