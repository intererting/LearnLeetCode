package com.yly.day4;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/9 下午2:11
 * @since 1.0
 */
public class LongestSubstring {
    public static int solution(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int left = 0;
        int max = 0;
        Map<Character, Integer> cMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (cMap.containsKey(str.charAt(i))) {
                left = Math.max(left, cMap.get(str.charAt(i)) + 1);
            }
            cMap.put(str.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return 0;
    }
}
