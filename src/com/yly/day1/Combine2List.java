package com.yly.day1;

import com.yly.ListNode;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/4 上午10:09
 * @since 1.0
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class Combine2List {
    public static ListNode solution(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = solution(l1.next, l2);
            return l1;
        } else {
            l2.next = solution(l1, l2.next);
            return l2;
        }
    }
}
