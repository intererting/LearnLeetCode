package com.yly.day5;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/12 下午1:28
 * @since 1.0
 */
public class Pow2 {
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

    //二进制解法,把n换成101101二进制形式,每个1所在位置就是需要平均的位置
    private static double multy(double x, int n) {
        double ans = 1.0;
        double powOf2 = x;
        while (n > 0) {
            if (n % 2 != 0) {
                //该位置有1
                ans *= powOf2;
            }
            powOf2 *= powOf2;
            n /= 2;
        }
        return ans;
    }
}
