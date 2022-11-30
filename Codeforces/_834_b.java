/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _834_b {
    static class Solution {
        public void solve(Scanner sc){
            int m = sc.nextInt();
            int val = sc.nextInt();
            int ar[] = new int[m];
            int max = -1, sum = 0;
            
            HashSet<Integer> hs = new HashSet<>();
            for(int i = 0 ; i < m ; i++){
                ar[i] = sc.nextInt();
                max = Math.max(ar[i], max);
                hs.add(ar[i]);
            }
            
            for(int i = 1 ; i <= max ; i++){
                if(!hs.contains(i))
                    sum += i;
            }
            
            boolean flag = false;
            while(sum <= val){
                if(sum == val){
                    flag = true;
                    break;
                }
                max++;
                sum += max;
            }
            
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
