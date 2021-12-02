package com.yly.day2;

import com.yly.ListNode;

import java.util.List;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/5 下午3:15
 * @since 1.0
 */
public class ReverseLink {
    public static ListNode solution(ListNode listNode, int left, int right) {
        ListNode fakeNode = new ListNode(-1);
        fakeNode.next = listNode;
        ListNode node = fakeNode;
        for (int i = 0; i < left; i++) {
            node = node.next;
        }
        ListNode pre = null;
        ListNode curent = node.next;
        ListNode next = curent.next;
        for (int i = left; i <= right; i++) {
            curent.next = pre;
            pre = curent;
            curent = next;
            next = curent.next;
        }
        node.next.next = curent;
        node.next = pre;
        return fakeNode.next;
    }
}
