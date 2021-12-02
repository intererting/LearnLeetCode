package com.yly.day3;

import com.yly.TreeNode;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/6 下午1:59
 * @since 1.0
 */
public class ZipTree {
    public static void solution(TreeNode treeNode) {
        if (null == treeNode) {
            return;
        }
        TreeNode left = treeNode.left;
        TreeNode right = treeNode.right;
        while (left != null) {
            left.next = right;
            left = left.right;
            right = right.left;
        }
        solution(treeNode.left);
        solution(treeNode.right);
    }
}
