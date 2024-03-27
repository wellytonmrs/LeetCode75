package com.leetcode.solutions;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int sIdx = 0, tIdx = 0;
        int tSize = t.length();
        int sSize = s.length();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if (sSize == 0)
            return true;

        while (tIdx < tSize) {
            if (sArr[sIdx] == tArr[tIdx++])
                sIdx++;

            if (sIdx == sSize)
                return true;
        }

        return false;
    }
}
