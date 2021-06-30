package com.chorlock.Sorting;

public class BubbleSort3 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        int k = 0;
        while (k < n - 1) {
            int last = n - 1;
            for (int j = n - 1; j > k; j--)
                if(a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
            k = last;
        }
    }
}
