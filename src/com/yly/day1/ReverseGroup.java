package com.yly.day1;

import com.yly.ListNode;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/4 上午10:22
 * @since 1.0
 */
public class ReverseGroup {

    public static ListNode solution(ListNode head, int group) {
        int num = 0;
        ListNode node = head;
        while (null != node) {
            num++;
            if (num > group) {
                break;
            }
            node = node.next;
        }
        if (num < group) {
            return head;
        }
        //反转
        ListNode pre = null;
        ListNode result = head;
        for (int i = 0; i < group; i++) {
            ListNode next = result.next;
            result.next = pre;
            pre = result;
            result = next;
        }
        assert pre != null;
        head.next = solution(result, group);
        return pre;
    }
}
