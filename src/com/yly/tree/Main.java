package com.yly.tree;

import com.yly.TreeNode;

import java.util.ArrayList;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/12 下午2:59
 * @since 1.0
 * --------------------1
 * -----------------2       3
 * -------------4      5        7
 * ----------6
 */
public class Main {

    public static void main(String[] args) {
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode4.left = treeNode6;
        treeNode3.right = treeNode7;
//        First.recursion(treeNode1);
//        First.iter(treeNode1);
//        Middle.recursion(treeNode1);
//        Middle.iter(treeNode1);
//        Middle.iter2(treeNode1);
//        Last.recursion(treeNode1);
//        Last.iter(treeNode1);
//        Level.solution(treeNode1);


        ReverseFirst.solution(treeNode1);

    }
}
