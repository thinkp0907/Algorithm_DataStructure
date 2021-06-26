package com.chorlock.Search;

import java.util.Scanner;

public class SeqSearchSen {
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;
        a[n] = key;

        while (true) {
            if (a[i] == key) {
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num+1];

        for (int i = 0; i < num; i++) {
            System.out.printf("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        System.out.printf("검색할 값 : ");
        int ky = scanner.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if (idx == -1) {
            System.out.printf("그 값의 요소가 없습니다.");
        } else {
            System.out.printf(ky + "은(는) x[" + idx + "]에 있습니다.");
        }
    }
}

