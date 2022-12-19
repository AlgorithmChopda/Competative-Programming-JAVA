/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class e_140_b {
    static class Solution {
        public void solve(Scanner sc){
            int n = sc.nextInt();
            int ar[] = new int[n];
            for(int i = 0 ; i < n ; i++)
                ar[i] = sc.nextInt();
            Arrays.sort(ar, 1, n);
            long val = ar[0];
            for(int i = 1 ; i < n ; i++){
                if(ar[i] > val){
                    val += (ar[i] - val + 1) / 2;
                    //System.out.println(val);
                }
            }
            System.out.println(val);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
