package com.yly.day3;

import com.yly.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/6 下午2:02
 * @since 1.0
 *
 * 中序遍历
 */
public class BSTIterator {

    private Deque<TreeNode> stack = new ArrayDeque<>();

    public BSTIterator(TreeNode root) {
        push(root);
    }

    public int next() {
        TreeNode treeNode = stack.getLast();
        TreeNode right = treeNode.right;
        push(right);
        return treeNode.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void push(TreeNode node) {
        while (node != null) {
            stack.add(node);
            node = node.left;
        }
    }
}
