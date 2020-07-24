package com.hugeant.basic;

import java.util.Arrays;

/**
 * @Program leetcode
 * @Description 归并排序
 * <p>
 * 1 把长度为n的输入序列分成两个长度为n/2的子序列；
 * 2 对这两个子序列分别采用归并排序；
 * 3 将两个排序好的子序列合并成一个最终的排序序列。
 * @Author hugeAnt
 * @Date 2020-07-20 13:47
 */
public class MergeSort extends SuperBasic {
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int num = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, num));
        int[] right = mergeSort(Arrays.copyOfRange(arr, num, arr.length));
        return sort(left, right);
    }

    //进行合并排序
    private static int[] sort(int[] leftArr, int[] rightArr) {
        int[] temArr = new int[leftArr.length + rightArr.length];
        int l = 0;
        int r = 0;
        while (l < leftArr.length && r < rightArr.length) {
            if (leftArr[l] > rightArr[r]) {
                temArr[l + r] = rightArr[r];
                r++;
            } else {
                temArr[l + r] = leftArr[l];
                l++;
            }
        }
        if (l >= leftArr.length) {
            for (int j = r; j < rightArr.length; j++) {
                temArr[l + j] = rightArr[j];
            }
        }
        if (r >= rightArr.length) {
            for (int j = l; j < leftArr.length; j++) {
                temArr[r + j] = leftArr[j];
            }
        }
        return temArr;
    }

    public static void main(String[] args) {
        print(mergeSort(new int[]{2, 7, 6, 1, 5, 3, 76, 31, 87, 15}));
    }
}
