package com.hugeant.basic;

import java.util.Arrays;

/**
 * @Program leetcode
 * @Description 快速排序
 * 快速排序的基本思想：通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，则可分别对这两部分记录继续进行排序，以达到整个序列有序。
 *
 * 从数列中挑出一个元素，称为 “基准”（pivot）；
 * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
 * 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
 * @Author hugeAnt
 * @Date 2020-07-27 09:13
 */
public class QuickSort extends SuperBasic{
    public static int[] quickSort(int[] arr) {
        return arr;
    }

    public static void main(String[] args) {
        print(quickSort(new int[]{2, 7, 6, 1, 5, 3, 76, 31, 87, 15}));
    }
}
