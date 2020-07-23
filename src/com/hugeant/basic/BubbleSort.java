package com.hugeant.basic;

/**
 * @Program leetcode
 * @Description 冒泡排序
 * <p>
 * 1.比较相邻的2个元素，如果第一个比第二个大，就交换他们的位置。
 * 2.对每一对相邻元素做同样的操作，从开始第一对到结尾的最后一对，这步骤完成后，最后的元素会是最大的元素。
 * 3.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * @Author hugeAnt
 * @Date 2020-07-20 13:47
 */
public class BubbleSort extends SuperBasic {
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        print(bubbleSort(new int[]{2, 7, 6, 1, 5, 3, 76, 31, 87, 15}));
    }
}
