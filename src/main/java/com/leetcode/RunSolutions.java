package com.leetcode;

import com.leetcode.solutions.IsSubsequence;

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
        MoveZeroes mz = new MoveZeroes();
        mz.moveZeroes(new int[]{0, 1, 0, 3, 12});
        */


        IsSubsequence sub = new IsSubsequence();
        System.out.println(sub.isSubsequence("abc", "ahbgdc"));
        System.out.println(sub.isSubsequence("axc", "ahbgdc"));
    }
}
