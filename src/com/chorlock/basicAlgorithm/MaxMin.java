package com.chorlock.basicAlgorithm;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int max = max4(1, 2, 3, 4);
        int min1 = min3(1, 2, 3);
        int min2 = min4(10, 12, 7,5);
        System.out.println("max = " + max);
        System.out.println("min = " + min1);
        System.out.println("min2 = " + min2);
    }

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;
        if(b<min) min = b;
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        return min;

    }
}
