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
public class _6214_conflict {
    static class Solution {
        public void solve(Scanner sc){
            String e1[] = {"16:53","19:00"};
            String e2[] = {"","03:00"};
            
            int t1 = Integer.parseInt(e1[0].split(":")[0]) * 60 + Integer.parseInt(e1[0].split(":")[1]);
            int t2 = Integer.parseInt(e1[1].split(":")[0]) * 60 + Integer.parseInt(e1[1].split(":")[1]);
            
            int time = Integer.parseInt(e2[0].split(":")[0]) * 60 + Integer.parseInt(e2[0].split(":")[1]);
            
            int time1 = Integer.parseInt(e2[1].split(":")[0]) * 60 + Integer.parseInt(e2[1].split(":")[1]);
            
            
            
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
