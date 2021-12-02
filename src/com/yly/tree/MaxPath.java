package com.yly.tree;

import com.yly.TreeNode;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/17 下午3:22
 * @since 1.0
 */
public class MaxPath {
    private int maxPath = Integer.MIN_VALUE;

    public int maxPath(TreeNode treeNode) {
        recursive(treeNode);
        return maxPath;
    }

    private int recursive(TreeNode treeNode) {
        if (null == treeNode) {
            return 0;
        }
        int left = Math.max(recursive(treeNode.left), 0);
        int right = Math.max(recursive(treeNode.right), 0);
        //第一种情况，左右分支形成环路
        maxPath = Math.max(maxPath, treeNode.val + left + right);
        //第二种情况，只取单边然后加上父节点一起计算
        return treeNode.val + Math.max(left, right);
    }
}
