package com.yly.day8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/18 上午11:11
 * @since 1.0
 */
public class Reg {
    /**
     * .*不能匹配换行符号
     * \s 可以匹配所有空白符号，包括换行
     */
    public static void testReg() {
        String s = "start   \n   second  \n   end";
//        Pattern pattern = Pattern.compile("^start.*end$");
//        Pattern pattern = Pattern.compile("^start.*\\n.*\\n.*end$");
        Pattern pattern = Pattern.compile("^start\\s*.*\\s*end$");
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches());
    }

    private static void testGroup() {
        String s = "a b c";
        Pattern pattern = Pattern.compile("(\\w+).*(\\w+).*(\\w+)");
//        Pattern pattern = Pattern.compile("(\\w+)");
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches());
        System.out.println(matcher.group(2));
//        System.out.println(matcher.groupCount());
//        while (matcher.find()) {
//            System.out.println(matcher.group(1));
//        }
    }

    private static void testNum() {
        String s = "123";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches());
    }

    public static void main(String[] args) {
        testNum();
    }
}
