package com.yly.day7;

import com.yly.ListNode;
import com.yly.TreeNode;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/17 下午4:18
 * @since 1.0
 * <p>
 * 寻找两个链表交点,路径差，寻找交点
 */
public class TwoLinkJoin {

    public static ListNode solution(ListNode a, ListNode b) {
        if (a == null || b == null) {
            return null;
        }
        while (a != b) {
            a = a == null ? b : a.next;
            b = b == null ? a : b.next;
        }
        return a;
    }
}
