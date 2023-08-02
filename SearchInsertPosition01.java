package com.erikaax.algoritmsleetcode;

/**
 *
 * @author Erika AX
 */


/*

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4


*/

public class SearchInsertPosition01 {
    
    public static void main(String[] args) {
        
        int[] nums = {1}; 
        int target = 0;
        int response = 0;
        
        for(response = 0;  response < nums.length; response++){
            
            if(nums[response] > target) {
                if(nums.length != 1 && response == nums.length) response++;
                break;
            }
            
            if(nums[response] == target) break;
        }
        
        System.out.println(response);
        
    }
    
}
