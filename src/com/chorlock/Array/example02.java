package com.chorlock.Array;

public class example02 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
    }

    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf(" %d ", a[i]);
        }
        System.out.println();
    }
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            System.out.println("a[" + i + "]과(와) a[" + (a.length - i - 1) + "]를 교환합니다.");
            swap(a, i, a.length - i - 1);
            print(a);

        }
    }

    public static void main(String[] args) {
        int[] x = {5, 10, 73, 2, -5, 42};

        for (int i = 0; i < x.length; i++) {
            System.out.printf(" %d ", x[i]);
        }
        System.out.println();

        reverse(x);
        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
