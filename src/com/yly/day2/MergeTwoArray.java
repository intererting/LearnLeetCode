package com.yly.day2;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/5 下午2:59
 * @since 1.0
 * [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 */
public class MergeTwoArray {
    public static void solution(int[] a, int m, int[] b, int n) {
        int len = m + n - 1;
        int lenA = m - 1;
        int lenB = n - 1;
        while (lenA >= 0 && lenB >= 0) {
            a[len--] = a[lenA] > b[lenB] ? a[lenA--] : b[lenB--];
        }
        if (lenB >= 0) {
            System.arraycopy(b, 0, a, 0, lenB + 1);
        }
    }
}
