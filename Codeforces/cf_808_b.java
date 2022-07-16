/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class cf_808_b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int x = sc.nextInt();
            int left = sc.nextInt();
            int right = sc.nextInt();
            
            if(x == 1){
                System.out.println("YES");
                System.out.println(left);
                continue;
            }
            if(x > right-left+1){
                System.out.println("NO");
                continue;
            }
            
            ArrayList<Integer> ar = new ArrayList<>();
            int cnt = 1;
            for(int i = left ; i <= right ; i++){
                if(cnt <= x){
                    if(i % cnt == 0){
                        cnt++;
                        ar.add(i);
                    }
                }
                else
                    break;
            }
            
            if(cnt <= x){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            for(int i = 0 ; i < ar.size() ; i++)
                System.out.print(ar.get(i)+" ");
            System.out.println();
            
        }
    }
}
