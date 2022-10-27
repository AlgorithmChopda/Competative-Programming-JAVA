/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _6224_subgcd {
    static class Solution {
        
        int gcd(int a, int b)
        {
            if (b == 0)
              return a;
            return gcd(b, a % b);
        }
        
        public int solve(Scanner sc){
            int ar[] = {};
            int k = 0;
            
            if(ar.length == 1){
                if(ar[0] == k)
                    return 1;
                else
                    return 0;
            }
                
            
            int c[] = new int[1001];
            int n = 1;
            c[0] = gcd(ar[0], ar[1]);
            int ans = 0;
            if(c[0] == k)
                ans++;
            
            for(int i = 2 ; i < ar.length ; i++){
                if(ar[i] == k)
                    ans++;
                for(int j = 0 ; j < n; j++){
                    c[j] = gcd(c[j], ar[i]);
                    if(c[j] == k)
                        ans++;
                }
                c[n] = gcd(ar[i], ar[i-1]);
                if(c[n] == k)
                    ans++;
                n++;
            }
            
           return ans;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
