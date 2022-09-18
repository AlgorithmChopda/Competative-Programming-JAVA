/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;
import javafx.util.Pair;

/**
 *
 * @author Vinay Jain
 */
public class _188_timetobuyandsell {
    class Solution {
        public int maxProfit(int k, int[] prices) {
            int n = prices.length;
            
            HashMap<Integer, Pair<Integer, Integer>> hs = new HashMap<>();
            //      index         sum      no_of_elements
            hs.put(n-1, new Pair(0, 0));
            
            int cur_max = 0;
            for(int i = n-2 ; i > 0 ; i--){
                hs.put(i, new Pair(0, 0));
                int cur_price = prices[i-1];
                for(int j = i+1 ; j < n ; j++){
                    if(k - hs.get(i).getValue() >= 1){
                        
                    }
                }
                if(k-hs.get(i).getValue() >= 1){
                    int val = prices[i] - cur_price;
                    if(i != n-1){ // if last element
                        
                    }
                }
            }
            
            return 0;
        }
    }
}
