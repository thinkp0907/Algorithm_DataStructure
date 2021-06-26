package com.chorlock.Stack_Queue;

import java.util.Scanner;

public class IntAryQueueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IntAryQueue intAryQue = new IntAryQueue(5);        // 최대 64개를 푸시할 수 있는 스택

        while (true) {
            System.out.println("현재 데이터 수 : " + intAryQue.size() + " / "
                    + intAryQue.capacity());

            System.out.printf("(1)인큐    (2)디큐    (3)피크   (4)덤프  (0)종료 : ");
            int menu = scanner.nextInt();
            if (menu == 0) {
                break;
            }

            int x;
            switch (menu) {
                case 1:
                    System.out.printf("데이터: ");
                    x = scanner.nextInt();
                    try {
                        intAryQue.enque(x);
                    } catch (IntAryQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찾습니다.");
                    }
                    break;

                case 2:
                    try {
                        x = intAryQue.deque();
                        System.out.println("디큐한 데이터는 " + x + "입니다.");
                    } catch (IntAryQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 3:
                    try {
                        x = intAryQue.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다");
                    } catch (IntAryQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 4:
                    intAryQue.dump();
                    break;
            }
        }
    }
}
