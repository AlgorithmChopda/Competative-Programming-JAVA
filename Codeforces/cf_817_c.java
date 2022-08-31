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
public class cf_817_c {
    static class Solution {
        public void solve(Scanner sc){
            int n = sc.nextInt();
            
            HashSet<String> a = new HashSet<>();
            HashSet<String> b = new HashSet<>();
            HashSet<String> c = new HashSet<>();
            
            int p_a = 0 , p_b = 0, p_c = 0;
            
            for(int i = 0 ; i < n ; i++)
                a.add(sc.next());
            for(int i = 0 ; i < n ; i++)
                b.add(sc.next());
            for(int i = 0 ; i < n ; i++)
                c.add(sc.next());
            
            for(String ele : a){
                if(b.contains(ele) && c.contains(ele)){
                    continue;
                }
                if(!b.contains(ele) && !c.contains(ele))
                    p_a += 3;
                else
                    p_a += 1;
            }
                    
            for(String ele : b){
                if(a.contains(ele) && c.contains(ele)){
                    continue;
                }
                if(!a.contains(ele) && !c.contains(ele))
                    p_b += 3;
                else
                    p_b += 1;
            }
            
            for(String ele : c){
                if(a.contains(ele) && b.contains(ele)){
                    continue;
                }
                if(!a.contains(ele) && !b.contains(ele))
                    p_c += 3;
                else
                    p_c += 1;
            }
            
            System.out.println(p_a+" "+p_b+" "+p_c);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){     
            new Solution().solve(sc);
        }
    }
}
