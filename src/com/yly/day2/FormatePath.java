package com.yly.day2;

import java.util.Arrays;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/5 下午2:34
 * @since 1.0
 */
public class FormatePath {
    public static String solution(String path) {
        String[] results = path.split("/");
        return Arrays.toString(results);
    }
}
