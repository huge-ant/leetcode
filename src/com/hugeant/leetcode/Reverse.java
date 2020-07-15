package com.hugeant.leetcode;

/**
 * @Program leetcode
 * @Description 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * @Author hugeAnt
 * @Date 2020-07-15 08:50
 */
public class Reverse {
    public static int reverse(int x) {
        long ans = 0;
        while (x != 0) {
            long pop = x % 10;
            ans = ans * 10 + pop;
            x /= 10;
        }
        return (int) ans == ans ? (int) ans : 0;
    }

    public static void main(String[] args) {
        int x = 65489;
        System.out.println("整数：" + x);
        System.out.println("反转后：" + reverse(65489));
    }
}
