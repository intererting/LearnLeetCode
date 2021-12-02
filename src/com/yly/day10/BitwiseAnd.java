package com.yly.day10;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/20 下午2:38
 * @since 1.0
 */
public class BitwiseAnd {
    public static int solution(int m, int n) {
        if (m == 0) {
            return 0;
        }
        int leftShift = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            leftShift++;
        }
        return m << leftShift;
    }
}
