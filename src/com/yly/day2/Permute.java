package com.yly.day2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/5 下午1:28
 * @since 1.0
 */
public class Permute {
    public static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayDeque<Integer> tmp = new ArrayDeque<>();
        int[] used = new int[nums.length];
        dfs(nums, used, result, tmp);
        return result;
    }

    private static void dfs(int[] nums, int[] used, List<List<Integer>> result, ArrayDeque<Integer> tmp) {
        if (tmp.size() == nums.length) {
            result.add(new ArrayList<>(tmp));
        }
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (used[i] == 1) {
                continue;
            }
            used[i] = 1;
            tmp.addLast(nums[i]);
            dfs(nums, used, result, tmp);
            tmp.removeLast();
            used[i] = 0;
        }
    }
}
