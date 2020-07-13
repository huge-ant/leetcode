package com.hugeant.leetcode;

/**
 * @Program bootdemo
 * @Description 最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author hugeAnt
 * @Date 2020-06-30 16:00
 */
public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        int beginIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = palindrome(s, i, i);
            int b = palindrome(s, i, i + 1);
            int c = Math.max(a,b);
            if (c > endIndex - beginIndex) {
                beginIndex = i - (c - 1) / 2;
                endIndex = i + c / 2;
            }
        }
        return s.substring(beginIndex, endIndex + 1);
    }

    private static int palindrome(String s, int left, int right) {
        while (left > 0 && right < s.length() - 1 && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }


    public static void main(String[] args) {
        String s = "cbbbbd";
        System.out.println(longestPalindrome(s));
    }
}
