package com.yly.day7;

import java.util.List;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/17 下午3:37
 * @since 1.0
 */
public class SplitWord {
    public static boolean solution(String s, List<String> wordDict) {
        int length = s.length();
        if (length == 0) {
            return false;
        }
        //保存每个点是否可以被切割
        boolean[] state = new boolean[length + 1];
        state[0] = true;
        for (int i = 1; i <= length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (wordDict.contains(s.substring(j, i)) && state[j]) {
                    state[i] = true;
                    break;
                }
            }
        }
        return state[length];
    }
}
