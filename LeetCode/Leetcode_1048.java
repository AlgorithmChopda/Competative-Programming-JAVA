/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Arrays;

/**
 *
 * @author Vinay Jain
 */
public class Leetcode_1048 {
    public static void main(String args[]){
        Leetcode_1048 o = new Leetcode_1048();
        String words[] = {"xbc","pcxbcf","xb","cxbc","pcxbc"};
        
        o.longestStrChain(words);
    }
    
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b)->Integer.compare(a.length(), b.length()));   
        
        int n = words.length;
        if(n == 1)
            return 1;
        
        int count[] = new int[n];
        count[n-1] = 1;
        
        for(int i = n-2 ; i >= 0 ; i--){
            int cur_cnt = 1;
            System.out.println("\n At : "+words[i]);
            for(int j = i+1 ; j < n ; j++){
                if(words[j].length()-words[i].length() == 1 ){
                    if(Match(words[i], words[j])){
                        cur_cnt = Math.max(count[j]+1, cur_cnt);
                    }
                }
            }    
            count[i] = cur_cnt;
        }
              
        int max = -1;
        for(int i = 0 ; i < n ; i++)
            max = Math.max(max, count[i]);
        return max;
    }

    public boolean Match(String s, String b) {
        
        //System.out.println("\n Comparing "+s+" : "+b);
        
        int index = 0;
        for(int i = 0 ; i < s.length() ; i++){
            index = b.indexOf(s.charAt(i), index); 
            if(index == -1){
                //System.out.println("failed");
                return false;
            }
        }
        //System.out.println("success");
        return true;
    }
   
}
