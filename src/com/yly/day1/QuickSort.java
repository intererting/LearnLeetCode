package com.yly.day1;

import java.util.Arrays;

/**
 * author        yiliyang
 * date          2022-12-30
 * time          下午4:44
 * version       1.0
 * since         1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {3, 1, 5, 7, 6, 2, 10, 22, 19, 4, 4, 8};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            //partition方法对序列进行排序
            int pivot = partition(a, low, high);
            //分割两个序列继续进行快排操作
            quickSort(a, low, pivot - 1);
            quickSort(a, pivot + 1, high);
        }
    }

    public static int partition(int[] a, int low, int high) {
        //取每个序列的第一个值作为基准值
        int pivotkey = a[low];
        while (low < high) {
            //从序列的右边开始往左遍历，直到找到小于基准值的元素
            while (high > low && a[high] >= pivotkey) {
                high--;
            }
            //将元素直接赋予给左边第一个，即pivotkey所在的位置
            a[low] = a[high];
            a[high] = pivotkey;
            //从序列的左边边开始往右遍历，直到找到大于基准值的元素
            while (high > low && a[low] <= pivotkey) {
                low++;
            }
            //此时的a[high]<pivotkey,已经被赋予到左边，所以可以将元素赋予给a[high]
            a[high] = a[low];
            a[low] = pivotkey;
        }
        //最后的low是基准值所在的位置
        a[low] = pivotkey;
        return low;
    }
}

