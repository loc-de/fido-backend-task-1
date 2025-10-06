package com.polis;

public class TwoThirdsOfLinkedList {

    public <T> Node<T> getTwoThirdsNode(Node<T> head) {
        if (head == null || head.next == null) return null;

        Node<T> cur = head, res = head;
        int n = 1, inx = 0;

        while ((cur = cur.next) != null) {
            int new_inx = 2 * ++n / 3 - 1;

            res = new_inx != inx ? res.next : res;
            inx = new_inx;
        }

        return res;
    }

}
