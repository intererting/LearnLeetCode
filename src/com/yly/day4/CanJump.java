package com.yly.day4;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/9 下午2:33
 * @since 1.0
 */
public class CanJump {
    public static boolean solution(int[] a) {
        int i = 0;
        for (int j = 0; j < a.length; j++) {
            if (j > i) {
                return false;
            }
            i = Math.max(i, j + a[j]);
        }
        return true;
    }
}
