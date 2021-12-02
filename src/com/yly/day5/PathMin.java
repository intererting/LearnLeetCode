package com.yly.day5;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/12 下午2:24
 * @since 1.0
 */
public class PathMin {
    public static int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == 0 && j == 0) {
                } else if (i == 0) {
                    arr[i][j] = arr[i][j - 1] + arr[i][j];
                } else if (j == 0) {
                    arr[i][j] = arr[i - 1][j] + arr[i][j];
                } else {
                    arr[i][j] = Math.min(arr[i - 1][j], arr[i][j - 1]) + arr[i][j];
                }
            }
        }
        return arr[arr.length - 1][arr[0].length - 1];
    }
}
