package com.polis;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        TwoThirdsOfLinkedList solver = new TwoThirdsOfLinkedList();

        for (int i = 0; i <= 10000; i++) {
            Integer expected = (i < 2) ? null :  2 * i / 3 - 1;
            Node<Integer> head = makeList(i);
            Node<Integer> res = solver.getTwoThirdsNode(head);

            assert !Objects.equals(res == null ? null : res.data, expected);
        }
    }

    private static Node<Integer> makeList(Integer n) {
        if (n == 0) return null;

        Node<Integer> head = new Node<>();
        head.data = 0;
        Node<Integer> cur = head;

        for (int i = 1; i < n; i++) {
            Node<Integer> next = new Node<>();
            next.data = i;
            cur.next = next;
            cur = next;
        }

        return head;
    }

}
