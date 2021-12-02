package com.yly.tree;

import com.yly.TreeNode;

import java.util.ArrayDeque;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/12 下午3:32
 * @since 1.0
 */
public class Last {
    public static void recursion(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        recursion(treeNode.left);
        recursion(treeNode.right);
        System.out.println(treeNode.val);
    }

    public static void iter(TreeNode treeNode) {
        if (null == treeNode) {
            return;
        }
        ArrayDeque<TreeNode> arrayDeque = new ArrayDeque<>();
        ArrayDeque<TreeNode> arrayDequeResult = new ArrayDeque<>();
        arrayDeque.addLast(treeNode);
        TreeNode node;
        while (!arrayDeque.isEmpty()) {
            node = arrayDeque.removeLast();
            arrayDequeResult.addLast(node);
            if (node.left != null) {
                arrayDeque.addLast(node.left);
            }
            if (node.right != null) {
                arrayDeque.addLast(node.right);
            }
        }
        while (!arrayDequeResult.isEmpty()) {
            System.out.println(arrayDequeResult.removeLast().val);
        }
    }
}
















