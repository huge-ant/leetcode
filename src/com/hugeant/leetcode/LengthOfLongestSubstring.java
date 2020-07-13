package com.hugeant.leetcode;

/**
 * @Program bootdemo
 * @Description 无重复最长子串的长度
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author hugeAnt
 * @Date 2020-06-28 11:45
 */
public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int rk = 0;
        int ans = 0;
        int n = s.length();
        String sb = "";
        for (int i = 0; i < n; i++) {
            if(i!=0){
                sb = sb.substring(1);
            }
            while (rk < n && !sb.contains(s.substring(rk, rk + 1))) {
                sb += (s.charAt(rk));
                rk++;
            }
            ans = Math.max(ans, rk - i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
