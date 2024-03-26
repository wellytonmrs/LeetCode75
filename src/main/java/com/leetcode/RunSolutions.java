package com.leetcode;

import com.leetcode.solutions.MoveZeroes;

import java.lang.reflect.Array;

public class RunSolutions {

    public static void main(String[] args) {
        // System.out.println(new MergeAlternately().mergeAlternately("Hello", "World!"));

        /*
        System.out.println(">>>>: " + new GenerateParentheses().generateParenthesis(1));
        System.out.println(">>>>: " + new GenerateParentheses().generateParenthesis(2));
        System.out.println(">>>>: " + new GenerateParentheses().generateParenthesis(3));
        */

        /*
        ImplementTrie trie = new ImplementTrie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));    // return True
        System.out.println(trie.search("app"));      // return False
        System.out.println(trie.startsWith("app"));         // return True
        trie.insert("app");
        System.out.println(trie.search("app"));      // return True
        */

  /*
    Example 1:

Input:
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]

     */

        MoveZeroes mz = new MoveZeroes();
        mz.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}
