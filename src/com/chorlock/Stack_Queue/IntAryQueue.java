package com.chorlock.Stack_Queue;

public class IntAryQueue {
    private int max;            // 큐 용량
    private int num;            // 현재 데이터 수
    private int[] que;          // 큐 본체


    // 실행 시 예외:  큐가 비어있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() { }
    }

    // 실행 시 예외: 큐가 가득차 있음
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    public IntAryQueue(int capacity) {
        this.num = 0;
        this.max = capacity;
        try {
            que = new int[max];             // 큐 본체 생성
        } catch (OutOfMemoryError error) {  // 생성 불가 시.
            max = 0;
        }
    }

    public int enque(int x) {
        if (num >= max) {
            throw new OverflowIntQueueException();
        } else{
            que[num++] = x;
        }
        return x;
    }

    public int deque() {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        } else {
            int result = que[0];
            for (int i = 0; i < num-1; i++) {
                que[i] = que[i+1];
            }
            num--;
            return result;
        }
    }

    public int peek() throws EmptyIntQueueException{
        if (num <= 0) {
            throw new EmptyIntQueueException();
        } else {
            return que[0];
        }
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            if (que[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        num = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }

    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비어 있습니다");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.printf(que[i]+" ");
            }
            System.out.println();
        }
    }


}
