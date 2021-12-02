package com.yly;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/4 上午10:07
 * @since 1.0
 */

public class ListNode {
    public int      val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }
}
