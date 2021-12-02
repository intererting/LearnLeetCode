package com.yly.day1;

import java.util.Arrays;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/4 上午11:20
 * @since 1.0
 */
public class DicSort {
    public static void solution(int[] data) {
        int len = data.length;
        for (int i = len - 1; i >= 0; i--) {
            if (i == 0) {
                Arrays.sort(data);
                return;
            }
            if (data[i] > data[i - 1]) {
                Arrays.sort(data, i, len);
                for (int j = i; j < len; j++) {
                    if (data[j] > data[i - 1]) {
                        int tmp = data[j];
                        data[j] = data[i - 1];
                        data[i - 1] = tmp;
                        return;
                    }
                }
            }
        }
    }
}
