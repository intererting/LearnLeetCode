package com.yly.day3;

import com.yly.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/6 下午1:39
 * @since 1.0
 */
public class TreeTraversal {

    public static List<Integer> solution(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        stack.add(node);
        TreeNode preNode = null;
        while (!stack.isEmpty()) {
            TreeNode curNode = stack.removeLast();
            if (null != preNode) {
                preNode.right = curNode;
                preNode.left = null;
            }
            result.add(curNode.val);
            if (curNode.right != null) {
                stack.add(curNode.right);
            }
            if (curNode.left != null) {
                stack.add(curNode.left);
            }
            preNode = curNode;
        }
        return result;
    }
}
