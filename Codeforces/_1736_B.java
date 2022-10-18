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
public class _1736_B {
    static class Solution {
        public void solve(Scanner sc){
            int n = sc.nextInt();
            
            int ar[] = new int[n];
            for(int i = 0 ; i < n ; i++)
                ar[i] = sc.nextInt();
            
            int l = 0, r = 0;
            long ans = n;
            for(int i = 1 ; i < n ; i++){
                if(ar[i] == 1){
                    l = i;
                    r = i;
                }
                else{
                    if(ar[i] > ar[i-1]){
                        r++;
                        ans += (r-l);
                    }    
                    else{
                        int index = i - ar[i] + 1;
                        if(index <= l ){
                            r++;
                            ans += (r-l);
                        }
                        else{
                            ans += (ar[i]-1);
                            l = index;
                            r = i;
                        }
                    }
                }
            }
            
            System.out.println(ans);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
