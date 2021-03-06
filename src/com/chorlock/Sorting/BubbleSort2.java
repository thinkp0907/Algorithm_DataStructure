package com.chorlock.Sorting;

import java.util.Scanner;

public class BubbleSort2 {

    static void swap(int[] a, int idx1, int idx2) { // a, 5, 6
        int t = a[idx1];            // t = a[5]
        a[idx1] = a[idx2];          // a[5] = a[6]
        a[idx2] = t;                // a[6] = t
    }

    static void bubbleSort(int[] a, int n) {
        int ccnt = 0;
        int scnt = 0;
        for (int i = 0; i < n - 1; i++) {
            int exchg = 0;
            System.out.println("패스" + (i+1));
            for (int j = n - 1; j > i; j--) {
                for (int m = 0; m < n - 1; m++) {
                    System.out.printf("%3d %c", a[m], (m != j-1) ? ' ' : (a[j-1] > a[j]) ? '+' : '-');
                }
                System.out.printf("%3d\n", a[n-1]);
                ccnt++;
                if(a[j-1] > a[j]) {
                    swap(a, j - 1, j);
                    scnt++;
                    exchg++;
                }
            }
            if (exchg == 0) break;
        }
        System.out.println("비교를 " + ccnt + "회 했습니다");
        System.out.println("교환을 " + scnt + "회 했습니다.");
    }

}
