package com.chorlock.Search;

import java.util.Scanner;

public class SeqSearch {
    static int seqSearch2(int[] a, int n, int key) {
        for (int i = 0; i < n; i++) {
            if(a[i] == key){ return i;}
        }
        return -1;
    }


    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i == n) {
                return -1;
            }
            if (a[i] == key) {
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        System.out.printf("검색할 값 : ");
        int ky = scanner.nextInt();
        int idx = seqSearch2(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(ky+"은(는) x[" +idx+ "]에 있습니다.");
        }
    }
}
