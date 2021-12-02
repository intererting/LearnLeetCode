package com.yly.tree;

import com.yly.TreeNode;

import java.util.ArrayDeque;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/12 下午3:13
 * @since 1.0
 */
public class Middle {

    public static void recursion(TreeNode treeNode) {
        if (null == treeNode) {
            return;
        }
        if (null != treeNode.left) {
            recursion(treeNode.left);
        }
        System.out.println(treeNode.val);
        if (null != treeNode.right) {
            recursion(treeNode.right);
        }
    }

    public static void iter(TreeNode treeNode) {
        if (null == treeNode) {
            return;
        }
        ArrayDeque<TreeNode> arrayDeque = new ArrayDeque<>();
        TreeNode head = treeNode;
        while (null != head) {
            arrayDeque.addLast(head);
            head = head.left;
        }
        TreeNode node;
        while (!arrayDeque.isEmpty()) {
            node = arrayDeque.removeLast();
            System.out.println(node.val);
            TreeNode right = node.right;
            while (null != right) {
                arrayDeque.addLast(right);
                right = right.left;
            }
        }
    }

    public static void iter2(TreeNode treeNode) {
        if (null == treeNode) {
            return;
        }
        ArrayDeque<TreeNode> arrayDeque = new ArrayDeque<>();
        TreeNode node = treeNode;
        while (node != null || !arrayDeque.isEmpty()) {
            if (node != null) {
                arrayDeque.addLast(node);
                node = node.left;
            } else {
                node = arrayDeque.removeLast();
                System.out.println(node.val);
                node = node.right;
            }
        }
    }
}
