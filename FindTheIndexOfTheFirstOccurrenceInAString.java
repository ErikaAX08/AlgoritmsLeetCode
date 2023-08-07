package com.erikaax.algoritmsleetcode;

/**
 *
 * @author Erika AX
 */

/*

PROBLEM:

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

*/
public class FindTheIndexOfTheFirstOccurrenceInAString {
    
    public static void main(String[] args) {
        
        String haystack = "abc";
        String needle = "c";
        int response = -1;
        
        if(haystack.contains(needle))  {

            if(haystack.length() == 1) {
                System.out.println(0);
                return;
            }
            
            for (int i = 0; i < haystack.toCharArray().length; i++) {
                
                if (i + needle.length() > haystack.toCharArray().length)
                    break;
                
                String currentString = haystack.substring(i, i + needle.length());
                
                if (currentString.contains(needle)) {
                    response  = i;
                    System.out.println(response);
                    break;
                }
                
            }
            
        }    
        else
           System.out.println(response);  
        
        
    }
    
}
