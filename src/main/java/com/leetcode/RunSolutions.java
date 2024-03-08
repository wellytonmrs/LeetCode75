package com.leetcode;

import com.leetcode.solutions.GenerateParentheses;
import com.leetcode.solutions.MergeAlternately;

public class RunSolutions {

    public static void main(String[] args) {
       // System.out.println(new MergeAlternately().mergeAlternately("Hello", "World!"));
        System.out.println(">>>>: " + new GenerateParentheses().generateParenthesis(1));
        System.out.println(">>>>: " + new GenerateParentheses().generateParenthesis(2));
        System.out.println(">>>>: " + new GenerateParentheses().generateParenthesis(3));
    }
}
