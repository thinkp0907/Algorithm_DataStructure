package com.chorlock.Array;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        int num = random.nextInt(10);
        System.out.printf("사람 수: %d\n", num);

        int[] height = new int[num];

        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < height.length; i++) {
            height[i] = 100 + random.nextInt(90);
            System.out.println("height["+i+"] = " + height[i]);
        }
        System.out.println("최댓값은 " + maxOf(height) + " 입니다.");

    }
}
