package com.yly;

import com.yly.day1.*;
import com.yly.day10.BitwiseAnd;
import com.yly.day2.*;
import com.yly.day3.TreeTraversal;
import com.yly.day4.BinarySearch;
import com.yly.day4.PrimaryCount;
import com.yly.day5.PathMin;
import com.yly.day5.Pow;
import com.yly.day5.Pow2;
import com.yly.day5.UniquePath;
import com.yly.day6.RemoveDuplicates;
import com.yly.day7.SplitWord;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        testCombine2List();
//        testReverseGroup();
//        testDiv();
//        testDictSort();
//        testSudo();
//        testCombineSum();
//        testJump();
//        testPermute();
//        testMaxSubArray();
//        testSpiralOrder();
//        testFormatPath();
//        testMergeTwoArray();
//        testReverseLink();
//        testTreeTraversal();
//        testPrimaryCount();
//        testBinarySearch();
//        testPow();
//        testUniquePath();
//        testPathMin();
//        testRemoveDuplicates();
        testBitwiseAnd();
    }

    private static void testBitwiseAnd() {
        System.out.println(BitwiseAnd.solution(26, 30));
    }

    private static void testRemoveDuplicates() {
        int[] arr = new int[]{1, 1, 2, 3, 4, 4, 4, 5, 6, 7, 7, 7};
        RemoveDuplicates.solution(arr);
    }

    private static void testPathMin() {

        System.out.println(PathMin.solution(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }

    private static void testUniquePath() {
        System.out.println(UniquePath.solution(3, 2));
    }

    private static void testPow() {
//        System.out.println(Pow.solution(2, 10) == Math.pow(2, 10));
        System.out.println(Pow2.solution(2, 9) == Math.pow(2, 9));
    }

    private static void testBinarySearch() {
        int[] array = new int[]{1, 3, 6, 7};
//        System.out.println(BinarySearch.leftBound(array, 5));
    }

    private static void testPrimaryCount() {
        System.out.println(PrimaryCount.countPrimary(10));
    }

    private static void testTreeTraversal() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(6);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode5;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;
        treeNode5.right = treeNode6;
        System.out.println(TreeTraversal.solution(treeNode1));
    }

    private static void testReverseLink() {
        ListNode l6 = new ListNode(6);
        ListNode l5 = new ListNode(5, l6);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ReverseLink.solution(l1, 1, 3);
        printListNode(l1);
    }

    private static void testMergeTwoArray() {
//        [1, 2, 3, 0, 0, 0],m = 3, nums2 = [2, 5, 6],n = 3
        int[] a = new int[]{1, 2, 3, 0, 0, 0};
        MergeTwoArray.solution(a, 3, new int[]{2, 5, 6}, 3);
        System.out.println(Arrays.toString(a));
    }

    private static void testFormatPath() {
        FormatePath.solution("//");
    }

    private static void testSpiralOrder() {
        System.out.println(SpiralOrder.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    private static void testMaxSubArray() {
        System.out.println(MaxSubArray.solution(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    private static void testPermute() {
        System.out.println(Permute.solution(new int[]{2, 3, 4}));
    }

    private static void testJump() {
        System.out.println(Jump.solution(new int[]{7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3}));
    }

    private static void testCombineSum() {
        int[] a = {2, 3, 6, 7};
        System.out.println(CombinationSum.solution(a, 7));
    }

    private static void testSudo() {
        Sudo.solution();
    }

    private static void testDictSort() {
        int[] a = {1, 1, 3};
        DicSort.solution(a);
        System.out.println(Arrays.toString(a));
    }

    private static void testDiv() {
        System.out.println(Div.solution(12, 6));
    }

    private static void testReverseGroup() {
        ListNode l6 = new ListNode(6);
        ListNode l5 = new ListNode(5, l6);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode result = ReverseGroup.solution(l1, 5);
        printListNode(result);
    }

    private static void testCombine2List() {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(3);
        ListNode l13 = new ListNode(5);
        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(2);
        ListNode l22 = new ListNode(4);
        ListNode l23 = new ListNode(6);
        l21.next = l22;
        l22.next = l23;

        ListNode result = Combine2List.solution(l11, l21);
        printListNode(result);
    }

    public static void printListNode(ListNode result) {
        while (null != result) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
