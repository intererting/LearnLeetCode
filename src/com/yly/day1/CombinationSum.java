package com.yly.day1;

import java.util.*;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/4 下午2:05
 * @since 1.0
 * <p>
 * 给定一个无重复元素的正整数数组 candidates 和一个正整数 target ，找出 candidates 中所有可以使数字和为目标数 target 的唯一组合。
 * <p>
 * candidates 中的数字可以无限制重复被选取。如果至少一个所选数字数量不同，则两种组合是唯一的。 
 * <p>
 * 对于给定的输入，保证和为 target 的唯一组合数少于 150 个。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CombinationSum {

    public static List<List<Integer>> solution(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, candidates.length, path, result);
        return result;
    }

    public static void dfs(int[] candidates, int target, int start, int length, Deque<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < length; i++) {
            if (target < candidates[i]) {
                return;
            }
            path.addLast(candidates[i]);
            dfs(candidates, target - candidates[i], i, length, path, result);
            path.removeLast();
        }
    }
}
