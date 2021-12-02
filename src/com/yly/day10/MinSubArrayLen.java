package com.yly.day10;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/31 下午2:44
 * @since 1.0
 */
public class MinSubArrayLen {
    public static int solution(int[] arr, int target) {
        int length = arr.length;
        if (length == 0) {
            return 0;
        }
        int left = 0, right = 0;
        int min = Integer.MAX_VALUE;
        int total = 0;
        while (right < length) {
            total += arr[right];
            right++;
            while (total >= target) {
                min = Math.min(min, total);
                total -= arr[left];
                left++;
            }
        }
        return min;
    }
}
