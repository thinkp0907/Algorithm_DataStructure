package com.chorlock.Array;

public class CloneArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();

        b[3] = 0;

        System.out.printf("a = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.printf("\nb =");
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
        }
    }
}
