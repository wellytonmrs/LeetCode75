package com.leetcode.solutions.arrayshashing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 */
public class GroupAnagrams {

    public static void main(String[] args) {

        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> outerList = new ArrayList<>();
        outerList.add(Arrays.asList("bat"));
        outerList.add(Arrays.asList("nat", "tan"));
        outerList.add(Arrays.asList("ate", "eat", "tea"));

        System.out.println("Array 1 - Expected: " + outerList + ", Returned: "
                + groupAnagrams(strs));

        String[] strs2 = { "", "", "" };
        List<List<String>> outerList2 = new ArrayList<>();
        outerList.add(Arrays.asList("", "", ""));

        System.out.println("Array 1 - Expected: " + outerList2 + ", Returned: "
                + groupAnagrams(strs2));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outerList = new ArrayList<>();

        HashMap<String, ArrayList<String>> groups = new HashMap<>();

        for (String word : strs) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<String>());
            }
            groups.get(key).add(word);
        }

        for (Map.Entry<String, ArrayList<String>> entry : groups.entrySet()) {
            outerList.add(entry.getValue());
        }
        return outerList;
    }

}
