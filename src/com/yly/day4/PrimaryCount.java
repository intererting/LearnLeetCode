package com.yly.day4;

import java.util.Arrays;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/9 下午1:29
 * @since 1.0
 */
public class PrimaryCount {

    public static int countPrimary(int n) {
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim, true);
        for (int i = 2; i * i < n; i++) {
            if (isPrim[i] = true) {
                for (int j = i * i; j < n; j += i) {
                    isPrim[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrim[i]) {
                count++;
            }
        }
        return count;
    }
}
