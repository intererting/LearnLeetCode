package com.yly.day2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/5 下午1:57
 * @since 1.0
 * <p>
 * [[1,2,3],[4,5,6],[7,8,9]]
 */
public class SpiralOrder {
    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        int l = 0;
        int r = matrix[0].length - 1;
        int t = 0;
        int b = matrix.length - 1;
        while (true) {
            //从左到右
            for (int i = l; i <= r; i++) {
                result.add(matrix[t][i]);
            }
            if (++t > b) {
                break;
            }
            //从上到下
            for (int i = t; i <= b; i++) {
                result.add(matrix[i][r]);
            }
            if (--r < l) {
                break;
            }
            //从右到左
            for (int i = r; i >= l; i--) {
                result.add(matrix[b][i]);
            }
            if (--b < t) {
                break;
            }
            //从下到上
            for (int i = b; i >= t; i--) {
                result.add(matrix[i][l]);
            }
            if (++l > r) {
                break;
            }
        }
        return result;
    }
}









