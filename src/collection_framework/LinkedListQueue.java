package collection_framework;

import java.util.LinkedList;

public class LinkedListQueue {
    public static void main(String[] args) {
        LinkedList<String> que = new LinkedList<>();
        que.offer("Box");
        que.offer("Toy");
        que.offer("Robot");

        System.out.println("que : " + que);

        // 무엇이 다음에 나올지 확인
        System.out.println("next : " + que.peek());

        // 첫 번째, 두 번째 인스턴스 꺼내기
        System.out.println(que.poll());
        System.out.println(que.poll());

        // 무엇이 다음에 나올지 확인
        System.out.println("next : " + que.peek());

        // 마지막 인스턴스 꺼내기
        System.out.println(que.poll());
    }
}
