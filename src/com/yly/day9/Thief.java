package com.yly.day9;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/19 上午10:02
 * @since 1.0
 */
public class Thief {
    public static int solution(int[] arr) {
        int length = arr.length;
        if (length == 0) {
            return 0;
        }
        int[] max = new int[arr.length];
        max[0] = 0;
        max[1] = arr[0];
        for (int i = 2; i <= length; i++) {
            max[i] = Math.max(max[i - 1], max[i - 2] + arr[i - 1]);
        }
        return max[max.length - 1];
    }
}
