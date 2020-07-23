package com.hugeant.basic;

/**
 * @Program leetcode
 * @Description 选择排序
 *
 * 1.首先在未排序的序列中找到最小/大的元素，存放到排序序列的起始位置。
 * 2.再从剩余未排序元素中继续寻找最小/大的元素，然后放到已排序序列的末尾。
 * 3.重复2步骤，知道所有元素均排序完毕.
 *
 * @Author hugeAnt
 * @Date 2020-07-20 14:31
 */
public class SelectionSort extends SuperBasic {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                swap(arr, i, min);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        print(selectionSort(new int[]{2, 7, 6, 1, 5, 3, 76, 31, 87, 15}));
    }
}
