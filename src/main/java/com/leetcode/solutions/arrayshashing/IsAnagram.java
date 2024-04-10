package com.leetcode.solutions.arrayshashing;

import java.util.HashMap;

public class IsAnagram {

    public static void main(String[] args) {

        // Call containsDuplicate for each array and print the return value
        boolean ret = isAnagram("anagram", "nagaram");
        String test = ret ? "Pass" : "Not Pass";
        System.out.println("Array 1 - Expected: true, Returned: " + ret + ", Test: " + test);

        ret = isAnagram("rat", "car");
        test = ret ? "Not Pass" : "Pass";
        System.out.println("Array 2 - Expected: false, Returned: " + ret + ", Test: " + test);


    }

    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> count = new HashMap<>();

        for (char charS : s.toCharArray()) {
            count.put(charS, count.getOrDefault(charS, 0) + 1);
        }

        for (char charT : t.toCharArray()) {
            count.put(charT, count.getOrDefault(charT, 0) - 1);
        }

        for (int value : count.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }

}
