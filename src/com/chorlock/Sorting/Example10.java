package com.chorlock.Sorting;

public class Example10 {
    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void quickSort(int[] a, int n) {
        int left = 0;
        int right = n -1;
        int pl = 0;                 // 왼쪽 커서
        int pr = n - 1;             // 오른쪽 커서
        int x = (pr + pl) / 2;      // 피벗

        do {
            while(a[pl] < x) pl++;
            while(a[pr] > x) pr--;
            if(pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        if(left < pr) quickSort(a, pr);
        if(pl < right) quickSort(a, right);
    }
}
