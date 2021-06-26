package com.chorlock.Stack_Queue;

import java.util.Scanner;

public class LastNElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int N = 10;
        int[] a = new int[N];
        int cnt = 0;
        int retry;


        System.out.println("정수를 입력하세요.");

        do {
            System.out.printf("%d번째 정수 : ", cnt + 1);
            a[cnt++ % N] = scanner.nextInt();
            System.out.printf("계속 할까요? (예.1/아니오.0) : ");;
            retry = scanner.nextInt();
        } while (retry == 1);

        int i= cnt - N;
        if(i < 0) i = 0;

        for (; i < cnt; i++) {
            System.out.printf("a[%d]번째의 정수 = %d\n", (i % N), a[i % N]);

        }
    }
}
