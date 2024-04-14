package com.leetcode.solutions.arrayshashing;

import java.util.HashSet;

/**Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct. */
public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 1};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        // Call containsDuplicate for each array and print the return value
        boolean ret = containsDuplicate(array1);
        String test = ret ? "Pass" : "Not Pass";
        System.out.println("Array 1 - Expected: true, Returned: " + ret + ", Test: " + test);

        ret = containsDuplicate(array2);
        test = ret ? "Not Pass" : "Pass";
        System.out.println("Array 2 - Expected: false, Returned: " + ret + ", Test: " + test);

        ret = containsDuplicate(array3);
        test = ret ? "Pass" : "Not Pass";
        System.out.println("Array 3 - Expected: true, Returned: " + ret + ", Test: " + test);
    }

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n))
                return true;
            else
                set.add(n);

        }
        return false;

    }

}
