package com.yly.day6;

import java.util.Arrays;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/13 上午9:21
 * @since 1.0
 * <p>
 * 删除重复出现的数字 2 可以为任何数,表示最多可以有多少个重复
 */
public class RemoveDuplicates {
    public static int solution(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n != nums[i - 2]) {
                nums[i] = n;
                i++;
            }
        }
        System.out.println(i);
        System.out.println(Arrays.toString(nums));
        return i;
    }
}
