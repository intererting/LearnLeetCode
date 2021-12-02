package com.yly.day5;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/12 下午1:28
 * @since 1.0
 */
public class Pow {
    public static double solution(double x, int n) {
        if (x == 1) {
            return 1;
        }
        if (n > 0) {
            return multy(x, n);
        } else if (n == 0) {
            return 1;
        } else {
            return 1.0 / multy(x, -n);
        }
    }

    private static double multy(double x, int n) {
        if (n == 1) {
            return x;
        }
        double y = multy(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }
}
