package com.yly.day1;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/4 上午10:51
 * @since 1.0
 * <p>
 * 除法的简单实现
 */
public class Div {

    public static int solution(int a, int b) {
        if (a == 0 || b == 0 || a < b) {
            return 0;
        }
        if (b == 1) {
            return a;
        }
        int divB = b;
        int count = 1;
        while (divB * 2 < a) {
            divB *= 2;
            count *= 2;
        }
        return count + solution(a - divB, b);
    }
}
