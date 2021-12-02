package com.yly.tree;

import com.yly.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/19 下午5:48
 * @since 1.0
 * <p>
 * 根----右-----左
 */
public class ReverseFirst {

    public static void solution(TreeNode treeNode) {
        ArrayList<Integer> result = new ArrayList<>();
//        dfs(treeNode, result, 1);
        iter(treeNode, result);
        System.out.println(result);
    }

    public static void dfs(TreeNode treeNode, ArrayList<Integer> result, int level) {
        if (treeNode == null) {
            return;
        }
        if (result.size() < level) {
            result.add(treeNode.val);
        }
        dfs(treeNode.right, result, level + 1);
        dfs(treeNode.left, result, level + 1);
    }

    public static void iter(TreeNode treeNode, ArrayList<Integer> result) {
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        stack.addLast(treeNode);
        while (!stack.isEmpty()) {
            int size = stack.size();
            TreeNode node;
            for (int i = 0; i < size; i++) {
                node = stack.removeLast();
                if (node.left != null) {
                    stack.addFirst(node.left);
                }
                if (node.right != null) {
                    stack.addFirst(node.right);
                }
                if (i == size - 1) {
                    result.add(node.val);
                }
            }
        }
    }
}
