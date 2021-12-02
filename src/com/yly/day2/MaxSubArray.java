package com.yly.day2;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/5 下午1:37
 * @since 1.0
 * nums = [-2,1,-3,4,-1,2,1,-5,4]
 */
public class MaxSubArray {

    public static int solution(int[] nums) {
        int ans = 0;
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
