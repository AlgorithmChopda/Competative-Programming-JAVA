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
public class _1736_A {
    static class Solution {
        public void solve(Scanner sc){
            int n = sc.nextInt();
            
            int ar[] = new int[n];
            int cnt = 0;
            for(int i = 0 ; i < n ; i++){
                ar[i] = sc.nextInt();
                if(ar[i] == 0)
                    cnt++;
            }
            int br[] = new int[n];
            for(int i = 0 ; i < n ; i++){
                br[i] = sc.nextInt();
                if(br[i] == 0)
                    cnt--;
            }
            cnt = Math.abs(cnt);
            
            int c_cnt = cnt;
            for(int i = 0 ; i < n ; i++)
                if(ar[i] != br[i])
                    c_cnt--;
            if(c_cnt == 0)
                System.out.println(cnt);
            else
                System.out.println(cnt+1);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
