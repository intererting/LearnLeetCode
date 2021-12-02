package com.yly.day3;

import com.yly.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/6 上午11:44
 * @since 1.0
 */
public class TreeZ {
    public List<List<Integer>> solution(TreeNode treeNode) {
        List<List<Integer>> result = new ArrayList<>();

        ArrayDeque<TreeNode> stack1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> stack2 = new ArrayDeque<>();

        stack1.add(treeNode);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            TreeNode node;
            ArrayList<Integer> tmp = new ArrayList<>();
            if (!stack1.isEmpty()) {
                while (!stack1.isEmpty()) {
                    node = stack1.removeLast();
                    tmp.add(node.val);
                    stack2.add(node.left);
                    stack2.add(node.right);
                }
            } else {
                while (!stack2.isEmpty()) {
                    node = stack2.removeLast();
                    tmp.add(node.val);
                    stack1.add(node.right);
                    stack1.add(node.left);
                }
            }
            result.add(tmp);
        }
        return result;
    }
}
