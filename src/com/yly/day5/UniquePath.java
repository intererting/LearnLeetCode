package com.yly.day5;

import java.util.Arrays;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/12 下午2:13
 * @since 1.0
 */
public class UniquePath {

    public static int solution(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            arr[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            arr[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        return arr[m - 1][n - 1];
    }
}
