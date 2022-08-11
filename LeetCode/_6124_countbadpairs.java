/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author Vinay Jain
 */
public class _6124_countbadpairs {
    class Solution {
        public long countBadPairs(int[] nums) {
            long cnt = 0;
            for(int i = 0 ; i < nums.length ; i++){
                for(int j = i+1 ; j < nums.length ; j++){
                    if(nums[i] >= nums[j])
                        cnt++;
                    else{
                        if ( nums[j] - nums[i] != (i-j) )
                            cnt++;
                    }
                }
            }
            
            return cnt;
        }
    }
}
