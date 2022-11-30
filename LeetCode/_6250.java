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
public class _6250 {
    static class Solution {
        public void solve(Scanner sc){
            
        }
        
        public int bestClosingTime(String ar) {
            char s[] = ar.toCharArray();
            int n = ar.length();
            int yes[] = new int[n];
            int no[] = new int[n];

            for(int i = 0 ; i < n ; i++){
                if(i == 0){
                    if(s[i] == 'Y')
                        yes[i] = 1;
                    else
                        yes[i] = 0;
                }
                else{
                    yes[i] = yes[i-1];
                    if(s[i] == 'Y')
                        yes[i]++;
                }
            }
            
            for(int i = 0 ; i < n ; i++){
                if(i == 0){
                    if(s[i] == 'N')
                        no[i] = 1;
                    else
                        no[i] = 0;
                }
                else{
                    no[i] = no[i-1];
                    if(s[i] == 'N')
                        no[i]++;
                }
            }
            
            for(int i : yes)
                System.out.println(i);
            System.out.println("\n ");
            for(int i : no)
                System.out.println(i);
            
            System.out.println("\n ");
            System.out.println("\n ");
               
            
            
            int val = 0;
            for(int i = 0 ; i < n ; i++){
                if(i == 0){
                    val = yes[n-1];
                }
                else{
                    val = no[i] + (yes[n-1] - yes[i]);
                }
                System.out.print(val+" ");
            }
            
            return 0;
        }
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
