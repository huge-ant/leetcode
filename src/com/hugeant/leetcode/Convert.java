package com.hugeant.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program bootdemo
 * @Description Z字形转换
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * <p>
 * L   C   I   R        1 5    9    13
 * E T O E S I I G      2 4 6  8 10 12 14 16
 * E   D   H   N        3   7    11    15
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 * <p>
 * 请你实现这个将字符串进行指定行数变换的函数：
 * <p>
 * string convert(string s, int numRows);
 * 示例 1:
 * <p>
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 示例 2:
 * <p>
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 * <p>
 * L     D     R            1   7       13
 * E   O E   I I            2   6   8   12  14
 * E C   I H   N            3   5   9   11  15
 * T     S     G            4       10      16
 * @Author hugeAnt
 * @Date 2020-07-13 11:17
 */
public class Convert {
    public static String convert(String s, int numRows) {
        if (s.length() == 1 || numRows > s.length()) {
            return s;
        }
        List<StringBuilder> rows = new ArrayList<>(numRows);
        for (int i = 0; i < s.length(); i++) {
            rows.add(new StringBuilder());
        }
        boolean goingDown = false;
        int rowNum = 0;
        for (char c:s.toCharArray()) {
            rows.get(rowNum).append(c);
            //判断goingDown变化
            if (rowNum == 0 || rowNum == numRows - 1) {
                goingDown = !goingDown;
            }
            //行号加一或减一
            rowNum += goingDown ? 1 : -1;
        }
        StringBuilder str = new StringBuilder();
        for(StringBuilder row:rows){
            str.append(row);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "dasdiuhjkcxzbf";
        System.out.println(convert(s, 8));
    }
}
