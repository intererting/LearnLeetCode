package com.yly;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/8/9 下午6:08
 * @since 1.0
 */
public class TestConcurent {

    private final static Map<Integer, Object> snapshotLockMap = new ConcurrentHashMap<>();
    private static       int                  count           = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    testMap(finalI);
                }
            }).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }

    private static void testMap(int id) {
        Object lock = new Object();
        Object oldLock = snapshotLockMap.putIfAbsent(id, lock);
        if (null == oldLock) {
            oldLock = lock;
        }
        synchronized (oldLock) {
            count++;
        }
    }
}
