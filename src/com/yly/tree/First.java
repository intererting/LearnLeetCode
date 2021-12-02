package com.yly.tree;

import com.yly.TreeNode;

import java.util.ArrayDeque;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/12 下午2:56
 * @since 1.0
 * <p>
 * 先序遍历
 */
public class First {
    public static void recursion(TreeNode treeNode) {
        if (null == treeNode) {
            return;
        }
        System.out.println(treeNode.val);
        recursion(treeNode.left);
        recursion(treeNode.right);
    }

    public static void iter(TreeNode treeNode) {
        ArrayDeque<TreeNode> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(treeNode);
        TreeNode node;
        while (!arrayDeque.isEmpty()) {
            node = arrayDeque.removeLast();
            System.out.println(node.val);
            if (null != node.right) {
                arrayDeque.addLast(node.right);
            }
            if (null != node.left) {
                arrayDeque.addLast(node.left);
            }
        }
    }
}
