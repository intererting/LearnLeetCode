package com.yly.day1;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/4 下午3:04
 * @since 1.0
 * 贪心算法
 */
public class Jump {
    public static int solution(int[] nums) {
        int max = 0;
        int end = 0;
        int step = 0;
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            max = Math.max(max, nums[i] + i);
            if (i == end) {
                step++;
                end = max;
            }
        }
        return step;
    }
}
