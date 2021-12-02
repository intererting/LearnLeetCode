package com.yly.day1;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/4 上午11:34
 * @since 1.0
 */
public class Sudo {
    public static void solution() {
        for (int i = 3; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
//输出九宫格
                int x = (i / 3) * 3 + j / 3;
                int y = (i % 3) * 3 + j % 3;

                System.out.println("x  :" + x + "   y  :" + y);
            }
        }
    }
}
