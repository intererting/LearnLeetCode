package com.yly.day7;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/17 下午3:08
 * @since 1.0
 */
public class Stock {

    public static int solution(int[] price) {
        int length = price.length;
        if (length < 2) {
            return 0;
        }
        //0表示持有现金
        //1表示持有股票
        int[][] state = new int[length][2];
        state[0][0] = 0;
        state[0][1] = -price[0];
        for (int i = 1; i < length; i++) {
            state[i][0] = Math.max(state[i - 1][0], state[i - 1][1] + price[i]);
            state[i][1] = Math.max(state[i - 1][0] - price[i], state[i - 1][1]);
        }
        return state[length - 1][0];
    }
}
