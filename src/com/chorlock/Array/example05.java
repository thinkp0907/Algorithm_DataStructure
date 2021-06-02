package com.chorlock.Array;

public class example05 {
    static void copy(int[] a, int[] b) {
        rcopy(a, b);
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = " + a[i]);
        }
    }

    private static void rcopy(int[] a, int[] b) {
        print(a);
        for (int i = 0; i < a.length; i++) {
            a[i] = b[a.length-i-1];
        }
        print(a);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {10, 11, 12, 13, 14};

        copy(a, b);
    }

}
