package com.yly.tree;

import com.yly.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/13 上午9:37
 * @since 1.0
 */
public class Level {
    public static void solution(TreeNode treeNode) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//        dfs(treeNode, result, 0);

        bfs(treeNode, result);

        System.out.println(Arrays.toString(result.toArray()));
    }

    private static void dfs(TreeNode treeNode, ArrayList<ArrayList<Integer>> result, int level) {
        if (null == treeNode) {
            return;
        }
        if (result.size() <= level) {
            result.add(0, new ArrayList<>());
        }
        result.get(result.size() - 1 - level).add(treeNode.val);
        dfs(treeNode.left, result, level + 1);
        dfs(treeNode.right, result, level + 1);
    }

    private static void bfs(TreeNode treeNode, ArrayList<ArrayList<Integer>> result) {
        if (null == treeNode) {
            return;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(treeNode);
        ArrayList<Integer> temp;
        TreeNode node;
        while (!queue.isEmpty()) {
            int size = queue.size();
            temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                node = queue.removeFirst();
                temp.add(node.val);
                if (node.left != null) {
                    queue.addLast(node.left);
                }
                if (node.right != null) {
                    queue.addLast(node.right);
                }
            }
            if (temp.size() > 0) {
                result.add(0, temp);
            }
        }
    }
}
