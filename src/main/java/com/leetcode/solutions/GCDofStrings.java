package com.leetcode.solutions;

public class GCDofStrings {

    public String gcdOfStrings(String str1, String str2) {

        if ((str1 + str2).equals(str2 + str1)) {
            return str1.substring(0, gcd(str2.length(), str1.length()));
        }

        return "";
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
