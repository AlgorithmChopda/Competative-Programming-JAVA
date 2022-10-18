/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _828_C {
    static class Solution {
        public int solve(Scanner sc){
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            
            String str = sc.next();
            
            if(c == 'g')
                return 0;
            
            int index = -1;
            for(int i = 0 ; i < n ; i++){
                if(str.charAt(i) == 'g'){
                    index = i;
                    break;
                }
            }
            
            int ans = 0;
            for(int i = n-1 ; i >= 0 ; i--){
                if(str.charAt(i) == 'g')
                    index = i;
                else{
                    if(str.charAt(i) == c){
                        if(index < i)
                            ans = Math.max(ans, (n - (i + 1) ) + index+1);
                        else
                            ans = Math.max(ans, Math.abs(index - i));
                    }
                }    
            }
            
            return ans;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            System.out.println(new Solution().solve(sc));
    }
}
