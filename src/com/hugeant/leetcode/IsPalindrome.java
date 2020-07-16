package com.hugeant.leetcode;

/**
 * @Program leetcode
 * @Description 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 * <p>
 * 你能不将整数转为字符串来解决这个问题吗？
 * @Author hugeAnt
 * @Date 2020-07-16 11:45
 */
public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        String xStr = String.valueOf(x);
        int length = xStr.length();
        char[] chars = xStr.toCharArray();
        char cc = chars[0];
        //偶位
        if (length % 2 == 0) {
            int indexLeft = length / 2;
            int indexRight = length / 2 + 1;
            while (indexRight - 1 < length) {
                if (xStr.charAt(indexLeft - 1) != xStr.charAt(indexRight - 1)) {
                    return false;
                }
                indexLeft--;
                indexRight ++;
            }
            return true;
        }
        //奇位
        int index = (length - 1) / 2;
        int k = 0;
        while (index + k < length) {
            if(xStr.charAt(index - k) != xStr.charAt(index + k)){
                return false;
            }
            k++;
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 1001;
        System.out.println("数字：" + x);
        System.out.println("是否为回文：" + isPalindrome(x));
    }
}
