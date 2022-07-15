/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodingNinjas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class contest_28_1 {
    
    static class Solution{
        void Solve(){
            
        }
        
        static int numSubsets(int n, ArrayList<Integer> ar) {
            int mean = 0;
            for (int i = 1; i < n; i++)
                mean = Math.max(mean, (int)Math.floor( (ar.get(i) + ar.get(i-1)) / 2));
            
            int cnt= 0;
            for (int i = 0; i < n; i++){
                if (ar.get(i) >= mean)
                    cnt++;
            }
            
            return ((int)Math.pow(2, n) - 1) % 1000000007;
            //return ans;
        }
        
        
        static int mangoes(ArrayList<Integer> ar) {
            int odd = 0 , even = 0;
            for(int i = 0 ; i < ar.size() ; i++){
                if( (i&1) == 1)
                    odd += ar.get(i);
                else
                    even += ar.get(i);
            }
            
            return Math.min(odd, even);
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            new Solution().Solve();
        }
    }   
    
}
