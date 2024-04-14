package com.leetcode.solutions.arrayshashing;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * You can return the answer in any order.
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] retArr = { 0, 1 };
        boolean ret = retArr == twoSum(nums, target);
        String test = ret ? "Pass" : "Not Pass";
        System.out.println("Array 1 - Expected: " + Arrays.toString(retArr) + ", Returned: "
                + Arrays.toString(twoSum(nums, target)));

        int[] nums2 = { 3, 2, 4 };
        target = 6;

        int[] retArr2 = { 1, 2 };
        ret = retArr2 == twoSum(nums2, target);
        System.out.println("Array 1 - Expected: " + Arrays.toString(retArr2) + ", Returned: "
                + Arrays.toString(twoSum(nums2, target)));

        int[] nums3 = { 3, 3 };
        target = 6;

        int[] retArr3 = { 0, 1 };
        ret = retArr3 == twoSum(nums3, target);
        System.out.println("Array 1 - Expected: " + Arrays.toString(retArr3) + ", Returned: "
                + Arrays.toString(twoSum(nums3, target)));

    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> sum = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (sum.containsKey(nums[i])) {
                return new int[] { sum.get(nums[i]), i };
            }
            sum.put(target - nums[i], i);
        }

        return null;
    }

}
