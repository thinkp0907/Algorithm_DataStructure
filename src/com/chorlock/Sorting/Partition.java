package com.chorlock.Sorting;

import java.util.Scanner;

public class Partition {
    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열을 나눕니다.
    static void partition(int[] a, int n) {
        int pl = 0;
        int pr = n - 1;
        int x = a[n / 2];

        do {
            while(a[pl] < x) pl++;
            // a[0] < x ?
            while(a[pr] > x) pr--;
            if (pl <= pr) {
                // swap 하고 pl 증가 , pr 증감 시켜서 다시 do~while 돌리기 위해.
                swap(a, pl++, pr--);
            }
        } while (pl <= pr);


        System.out.println("피벗의 값은 " + x + "입니다.");

        System.out.println("피벗 이하의 그룹");
        for(int i=0; i<= pl - 1; i++)
            System.out.printf(a[i] + " ");
        System.out.println();

        if (pl > pr + 1) {
            System.out.println("피벗과 일치하는 그룹");
            for(int i= pr + 1; i <= pl - 1; i++)
                System.out.printf(a[i] + " ");
            System.out.println();
        }

        System.out.println("피벗 이상의 그룹");
        for(int i = pr + 1; i < n; i++)
            System.out.printf(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열을 나눕니다.");
        System.out.printf("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.printf("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        partition(x, nx);
    }

}
