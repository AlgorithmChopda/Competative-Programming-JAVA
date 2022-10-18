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
public class _827_B {
    static class Solution {
        public void solve(Scanner sc){
            HashSet<Long> ar = new HashSet<>();
            int n = sc.nextInt();
            boolean flag = true;
            for(int i = 0 ; i < n ; i++){
                long ele = sc.nextLong();
                if(ar.contains(ele))
                    flag = false;
                ar.add(ele);
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
