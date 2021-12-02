package com.yly;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/6 上午11:46
 * @since 1.0
 */
public class TreeNode {
    public int      val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode next;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}