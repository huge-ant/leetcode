package com.hugeant.basic;

/**
 * @Program leetcode
 * @Description 排序基本类
 * @Author hugeAnt
 * @Date 2020-07-20 14:05
 */
public class SuperBasic {
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("");
    }
}
