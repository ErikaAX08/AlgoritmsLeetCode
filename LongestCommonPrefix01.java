package com.erikaax.algoritmsleetcode;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Erika AX
 */



/*

PROBLEM:

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

*/

public class LongestCommonPrefix01 {
    
    public static void main(String[] args) {
        
        String[] strs = {"a", "ab"};
        String firstWord = strs[0];
        int numIteration = 0;
        String response = "";
        
        if(firstWord.isEmpty()) response = "";

        if(strs.length == 1 && !firstWord.isEmpty()) response = String.valueOf(firstWord.charAt(0));
        
        for (int i = 0; i < firstWord.toCharArray().length; i++) {
            
            if (firstWord.toCharArray().length == 1) {
             
                for(String word : strs){
                
                    if (numIteration == strs.length) break;
                
                    if (word.contains(String.valueOf(firstWord.charAt(0)))) {
                        numIteration++;
                        response = String.valueOf(firstWord.charAt(0));
                }else {
                    response = "";
                    break;
                    
                }
                
            }
            
            String currentWords = String.valueOf(firstWord.charAt(i)) + String.valueOf(firstWord.charAt(i + 1));
            
            System.out.println(currentWords);
            
            for(String word : strs){
                
                if (numIteration == strs.length) break;
                
                if (word.contains(currentWords)) {
                    numIteration++;
                    response = currentWords;
                    
                }else {
                    response = "";
                    break;
                    
                }
                
            }
            
        }
        
        System.out.println(response);
        
    }}
    
}
