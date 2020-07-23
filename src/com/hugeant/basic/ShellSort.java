package com.hugeant.basic;

import java.util.Arrays;

/**
 * @Program leetcode
 * @Description 希尔排序
 * @Author hugeAnt
 * @Date 2020-07-23 10:06
 */
public class ShellSort extends SuperBasic {
    public static int[] shellSort(int[] arr) {
        int gap = 1;
        while (gap < arr.length) {
            gap = gap * 3 + 1;
        }
        while (gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                int tmp = arr[i];
                int j = i - gap;
                while (j >= 0 && arr[j] > tmp) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = tmp;
            }
            gap = (int) Math.floor(gap / 3.0);
        }
        return arr;
    }

    public static void main(String[] args) {
        print(shellSort(new int[]{2, 7, 6, 1, 5, 3, 76, 31, 87, 15}));
    }
}
