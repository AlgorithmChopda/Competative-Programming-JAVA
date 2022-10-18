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
public class _829_C {
    static class Solution {
        public void solve(Scanner sc){
            int n = sc.nextInt();
            String str = sc.next();
            int lid[] = new int[n];
            for(int i = 0 ; i < n ; i++)
                lid[i] = str.charAt(i) - '0';
            
            int ar[] = new int[n];
            for(int i = 0 ; i < n ; i++)
                ar[i] = sc.nextInt();
            
            for(int i = 0 ; i < n ; i++){
                if(lid[i] == 1 && i != 0){
                    int index = i-1;
                    boolean flag = false;
                    while(true){
                        //System.out.println("\n "+flag);
                        if(index == -1 || ar[index] <= ar[i]){
                            flag = true;
                            break;
                        }
                        if(lid[index] == 0)
                            break;
                        index--;
                    }
                    
                    if(flag == false){
                        lid[index] = 1;
                        lid[i] = 0;
                    }
                }
            }
            
            int sum = 0;
            for(int i = 0 ; i < n ; i++){
                if(lid[i] == 1)
                    sum += ar[i];
            }
            
            System.out.println(sum);
            
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
