package com.chorlock.Array;

public class example04 {
    static void copy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = " + a[i]);
        }
        a = b.clone();
        System.out.println("After Clone int[] b to int[] a");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = " + a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 4, 3, 2, 1};

        copy(a, b);
    }
}
